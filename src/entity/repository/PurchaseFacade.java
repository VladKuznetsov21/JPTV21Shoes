/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.repository;

import entity.Purchase;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author pupil
 */
public class PurchaseFacade {
    private final EntityManager em;
    private final EntityTransaction tx;

    public PurchaseFacade() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTV21Shoes_KuznetsovPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
    }
    public void save(Purchase purchase){
        tx.begin();
            em.persist(purchase);
        tx.commit();
    }
    public Purchase find(Long id){
        return em.find(Purchase.class, id);
    }
    public List<Purchase> findAll(){
        return em.createQuery("SELECT p FROM Purchase p")
                .getResultList();
    }
    
}
