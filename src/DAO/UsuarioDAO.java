/*The MIT License (MIT)

 Copyright (c) 2016 MicheleBarcelos

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.*/
package DAO;

import java.util.List;
import model.Usuario;
import model.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsuarioDAO {

    Usuario usuario = new Usuario();
    private final Session session;
    private Transaction transaction;

    public UsuarioDAO() {

        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void inserir(Usuario usuario) {
        transaction = session.beginTransaction();
        try {
            session.save(usuario);
            session.flush();
            session.getTransaction().commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        session.close();
    }

    public List<Usuario> findAll() {
        List<Usuario> usuarios = (List<Usuario>) session.createQuery("from Usuario").list();
        return usuarios;

    }

    public Usuario findById(int id) {
        Usuario usuarios = (Usuario) session.get(Usuario.class, id);
        return usuarios;

    }

    public void atualizar(Usuario usuario) {
        transaction = session.beginTransaction();
        try {
            session.update(usuario);
            session.getTransaction().commit();
        } catch (Exception e) {
            transaction.rollback();
        }
    }

    public void deleteById(int id) {
        transaction = session.beginTransaction();
        try {
            session.delete(findById(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            transaction.rollback();
        }
    }

    public List<Usuario> findByNome(String nome) {
        String sql = "from Usuario c where c.nome LIKE :nome";
        List result = session.createQuery(sql).setParameter("nome", "%" + nome + "%").list();
        return (List<Usuario>) result;
    }

}
