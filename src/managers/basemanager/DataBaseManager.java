/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers.basemanager;

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

/**
 *
 * @author pupil
 */
public class DataBaseManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTV21Shoes_KuznetsovPU");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();
    
    public void saveproducts(List<Product> products){
        tx.begin();
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                if(product.getId() == null){
                    em.persist(product);
                }else{
                    em.merge(product);
                }

            }
        tx.commit();
    }
    public List<Product> loadProducts(){
        try {
            return em.createQuery("SELECT p FROM Product p")
                    .getResultList();
        } catch (Exception ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, "Неудалось загрузить продукт", ex);
            return new ArrayList<>();
        }
    }
    public void savePokupateli(List<Pokupatel> pokupateli) {
        tx.begin();
            for (int i = 0; i < pokupateli.size(); i++) {
                Pokupatel pokupatel = pokupateli.get(i);
                if(pokupatel.getId() == null){
                    em.persist(pokupatel);
                }else{
                    em.merge(pokupatel);
                }
            }
        tx.commit();
        
    }
    public List<Pokupatel> loadPokupateli(){
        try {
            return em.createQuery("SELECT p FROM Pokupatel p")
                    .getResultList();
        } catch (Exception ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, "Неудалось загрузить покупателя", ex);
            return new ArrayList<>();
        }
    }
    public void savePurchases(List<Purchase> purchases) {
        tx.begin();
            for (int i = 0; i < purchases.size(); i++) {
                Purchase purchase = purchases.get(i);
                if(purchase.getId() == null && purchase.getReturnProduct() == null){
                    em.persist(purchase);
                }else{
                    em.merge(purchase);
                }
            }
        tx.commit();
    }
    public List<Purchase> loadPurchases() {
        try {
            return em.createQuery("SELECT p FROM Purchase p")
                    .getResultList();
        } catch (Exception ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, "Неудалось загрузить истории", ex);
            return new ArrayList<>();
        }
    }
}
