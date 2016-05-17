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
import model.HibernateUtil;
import model.Formapagto;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Michele Barcelos
 */
public class FormapagtoDAO {

    Formapagto formapagto = new Formapagto();
    private final Session session;
    private Transaction transaction;

    public FormapagtoDAO() {

        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void inserir(Formapagto formapagto) {
        transaction = session.beginTransaction();
        try {
            session.save(formapagto);
            session.flush();
            session.getTransaction().commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        session.close();
    }

    public List<Formapagto> findAll() {
        List<Formapagto> formapagtos = (List<Formapagto>) session.createQuery("from Formapagto").list();
        return formapagtos;

    }

    public Formapagto findById(int id) {
        Formapagto formapagtos = (Formapagto) session.get(Formapagto.class, id);
        return formapagtos;

    }

    public void atualizar(Formapagto formapagto) {
        transaction = session.beginTransaction();
        try {
            session.update(formapagto);
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

    public List<Formapagto> findByNome(String nome) {
        String sql = "from Formapagto c where c.descricao LIKE :descricao";
        List result = session.createQuery(sql).setParameter("descricao", "%" + nome + "%").list();
        return (List<Formapagto>) result;
    }
}
