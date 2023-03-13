/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.repository;
import entity.Pokupatel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author pupil
 */
public class PokupatelFacade {
    public class ReaderFacade {
    private final EntityManager em;
    private final EntityTransaction tx;

    public ReaderFacade() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTV21Shoes_KuznetsovPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
    }
    
    public void save(Pokupatel pokupatel){
        tx.begin();
            em.persist(pokupatel);
        tx.commit();
    }
    public Pokupatel find(Long id){
        return em.find(Pokupatel.class, id);
    }
    public List<Pokupatel> findAll(){
        return em.createQuery("SELECT p FROM Pokupatel p")
                .getResultList();
    }
    
    }
    
}
