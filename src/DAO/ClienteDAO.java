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

import model.HibernateUtil;
import java.util.List;
import model.Cliente;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Michele Barcelos
 */
public class ClienteDAO {

    Cliente cliente = new Cliente();
    private final Session session;
    private Transaction transaction;

    public ClienteDAO() {

        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void inserir(Cliente cliente) {
        transaction = session.beginTransaction();
        try {
            session.save(cliente);
            session.flush();
            session.getTransaction().commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        session.close();
    }

    public List<Cliente> findAll() {
        List<Cliente> clientes = (List<Cliente>) session.createQuery("from Cliente").list();
        return clientes;

    }

    public Cliente findById(int id) {
        Cliente clientes = (Cliente) session.get(Cliente.class, id);
        return clientes;

    }

    public void atualizar(Cliente cliente) {
        transaction = session.beginTransaction();
        try {
            session.update(cliente);
            session.flush();
            session.getTransaction().commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        session.close();
    }

    public void deleteById(int id) {
        transaction = session.beginTransaction();
        try {
            session.delete(findById(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        session.close();
    }

    public List<Cliente> findByNome(String nome) {
        String sql = "from Cliente c where c.nome LIKE :nome";
        List result = session.createQuery(sql).setParameter("nome", "%" + nome + "%").list();
        return (List<Cliente>) result;
    }

}
