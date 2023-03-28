package managers;

import entity.Pokupatel;
import entity.Product;
import entity.Purchase;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
public class DataManager {
    
    public void saveProduct(Product[] products){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTV21Shoes_KuznetsovPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        for (int i = 0; i < products.length; i++) {
            if(products[i].getId()==null){
                em.persist(products[i]);
            }else{
                em.merge(products[i]);
            }
        }
        em.getTransaction().commit();
    
    }
    
    public void savePokupatel(Pokupatel[] pokupateli){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTV21Shoes_KuznetsovPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        for (int i = 0; i < pokupateli.length; i++) {
            if(pokupateli[i].getId()==null){
                em.persist(pokupateli[i]);
            }else{
                em.merge(pokupateli[i]);
            }
        }
        em.getTransaction().commit();
    
    }
    
    public void savePurchase(Purchase[] purchases){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTV21Shoes_KuznetsovPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        for (int i = 0; i < purchases.length; i++) {
            if(purchases[i].getId()==null){
                em.persist(purchases[i]);
            }else{
                em.merge(purchases[i]);
            }
        }
        em.getTransaction().commit();
    
    }
}
