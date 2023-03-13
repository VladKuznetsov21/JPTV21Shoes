/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Pokupatel;
import entity.Product;
import entity.Purchase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pupil
 */
public class DataManager {
    
    private final String PRODUCTS_FILE = "MyProducts";
    private final String POKUPATELI_FILE = "MyPokupateli";
    private final String PURCHASES_FILE = "MyPurchases";
    
    public void saveProducs(List<Product> products){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PRODUCTS_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Нет MyProducts файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Ошибка ввода данных", ex);
        }
    }
    
    public List<Product> loadproducts() {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(PRODUCTS_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE,"Нет файла MyProducts", ex);
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Ошибка ввода/вывода", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return products;
    }
    
     public void savePokupateli(List<Pokupatel> pokupateli) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(POKUPATELI_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(pokupateli);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Нет MyPokupateli файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Ошибка ввода данных", ex);
        }
    }

    public List<Pokupatel> loadPokupateli() {
        List<Pokupatel> pokupateli = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(POKUPATELI_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            pokupateli = (List<Pokupatel>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE,"Нет файла MyPokupateli", ex);
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Ошибка ввода/вывода", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return pokupateli;
    }


    public void savePurchases(List<Purchase> purchases) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PURCHASES_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(purchases);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Нет MyPurchases файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Ошибка ввода данных", ex);
        }
    }
    
    public List<Purchase> loadPurchases() {
        List<Purchase> purchases = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(PURCHASES_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            purchases = (List<Purchase>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE,"Нет файла MyPurchases", ex);
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Ошибка ввода/вывода", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return purchases;
    }
}