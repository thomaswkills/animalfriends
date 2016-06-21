/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.jpa.internal.EntityManagerImpl;


public class Banco {
     private static Banco instancia;
    private EntityManager em;

    private Banco() {
        em = Persistence.createEntityManagerFactory("AnimalFriendsPU").
                createEntityManager();
    }

    public synchronized static Banco getInstancia() {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

    
    
    public EntityManager getEm() {
        return em;
    }
    
    
    
    
}