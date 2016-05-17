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
import model.Recheio;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Michele Barcelos
 */
public class RecheioDAO {

    Recheio recheio = new Recheio();
    private final Session session;
    private Transaction transaction;

    public RecheioDAO() {

        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void inserir(Recheio recheio) {
        transaction = session.beginTransaction();
        try {
            session.save(recheio);
            session.flush();
            session.getTransaction().commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        session.close();
    }

    public List<Recheio> findAll() {
        List<Recheio> recheios = (List<Recheio>) session.createQuery("from Recheio").list();
        return recheios;

    }

    public Recheio findById(int id) {
        Recheio recheios = (Recheio) session.get(Recheio.class, id);
        return recheios;

    }

    public void atualizar(Recheio recheio) {
        transaction = session.beginTransaction();
        try {
            session.update(recheio);
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

    public List<Recheio> findByNome(String nome) {
        String sql = "from Recheio c where c.descricao LIKE :descricao";
        List result = session.createQuery(sql).setParameter("descricao", "%" + nome + "%").list();
        return (List<Recheio>) result;
    }

}
