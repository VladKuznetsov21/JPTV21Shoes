/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.repository;

import entity.Pokupatel;
import entity.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author pupil
 */
public class ProductFacade {
    private final EntityManager em;
    private final EntityTransaction tx;
    
    public ProductFacade() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTV21Shoes_KuznetsovPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
    }
    public void save(Product product){
        tx.begin();
            for (int i = 0; i < product.getokupateli().hashCode(); i++) {
                Pokupatel pokupatel = product.getPokupateli().get(i);
                if(pokupatel.getId() == null){
                    em.persist(pokupatel);
                }else{
                    em.merge(pokupatel);
                }
            }
            if(product.getId() == null){
                em.persist(product);
            }else{
                em.merge(product);
            }
        tx.commit();
    }
    public Product find(Long id){
        return em.find(Product.class, id);
    }
    public List<Product> findAll(){
        return em.createQuery("SELECT p FROM Product p")
                .getResultList();
    }
}
