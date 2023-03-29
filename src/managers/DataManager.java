package managers;

import entity.Pokupatel;
import entity.Product;
import entity.Purchase;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
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

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTV21Shoes_KuznetsovPU");
    private EntityManager em = emf.createEntityManager();
    
    public void saveProducts(List<Product> products){
        em.getTransaction().begin();
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()==null){
                em.persist(products.get(i));
            }else{
                em.merge(products.get(i));
            }
        }
        em.getTransaction().commit();
    
    }
    public List<Product> loadProducts() {
        try {
            return em.createQuery("SELECT p FROM Product p")
                    .getResultList();
        } catch (Exception ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Неудалось загрузить книги", ex);
            return new ArrayList<>();
        }
    }
    
    public void savePokupateli(List<Pokupatel> pokupateli){
        em.getTransaction().begin();
        for (int i = 0; i < pokupateli.size(); i++) {
            if(pokupateli.get(i).getId()==null){
                em.persist(pokupateli.get(i));
            }else{
                em.merge(pokupateli.get(i));
            }
        }
        em.getTransaction().commit(); 
    }
    public List<Pokupatel> loadPokupateli() {
        try {
            return em.createQuery("SELECT p FROM Pokupatel p")
                    .getResultList();
        } catch (Exception ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Неудалось загрузить покупателя", ex);
            return new ArrayList<>();
        }
    }
    
    public void savePurchases(List<Purchase> purchases){
        em.getTransaction().begin();
        for (int i = 0; i < purchases.size(); i++) {
            if(purchases.get(i).getId()==null){
                em.persist(purchases.get(i));
            }else{
                em.merge(purchases.get(i));
            }
        }
        em.getTransaction().commit();
    }
    public List<Purchase> loadPurchases() {
        try {
            return em.createQuery("SELECT p FROM Purchase p")
                    .getResultList();
        } catch (Exception ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Неудалось загрузить покупку", ex);
            return new ArrayList<>();
        }
    }

    


}
