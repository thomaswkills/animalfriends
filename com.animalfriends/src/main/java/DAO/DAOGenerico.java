/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.lang.reflect.Method;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class DAOGenerico {

    EntityManager em;

      public List lista(Class classe) {
        em = Banco.getInstancia().getEm();
        em.getTransaction().begin();
        Query q = em.createQuery("from " + classe.getSimpleName()+" where (status is null or status <> 'excluido')");
        em.getTransaction().commit();
        return q.getResultList();
    }
    
    public List listaCondicao(Class classe, String condicao) {
        em = Banco.getInstancia().getEm();
        em.getTransaction().begin();
        Query q = em.createQuery("from " + classe.getSimpleName() +" where (status is null or status <> 'excluido') and "+condicao);
        em.getTransaction().commit();
        return q.getResultList();
    }

    public void inserir(Object marca) {
        em = Banco.getInstancia().getEm();
        em.getTransaction().begin();
        em.persist(marca);
        em.getTransaction().commit();
    }

    public void exluir(Object objeto) throws Exception {
        em = Banco.getInstancia().getEm();
        em.getTransaction().begin();
        Method getChave = objeto.getClass().getMethod("getId", new Class[0]);
        objeto = em.find(objeto.getClass(), getChave.invoke(objeto, new Object[0]));
        em.remove(objeto);
        em.getTransaction().commit();

    }

    public void salvar(Object objeto) {
        em = Banco.getInstancia().getEm();
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
    }

    public Object recupera(Class classe, Long id) {
        em = Banco.getInstancia().getEm();
        Object retornando = null;
        em.getTransaction().begin();
        retornando = em.find(classe, id);
        em.getTransaction().commit();
        return retornando;
    }
}
