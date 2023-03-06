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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pupil
 */
public class DataManager {
    public void saveProducs(Product[] products){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("MyProducts");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Нет MyProducts файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Ошибка ввода данных", ex);
        }
    }
    
    public Product[] loadproducts() {
        Product[] products = new Product[0];
        try {
            FileInputStream fileInputStream = new FileInputStream("MyProducts");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (Product[]) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE,"Нет файла MyProducts", ex);
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Ошибка ввода/вывода", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return products;
    }
    
     public void savePokupateli(Pokupatel[] pokupateli) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("MyPokupateli");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(pokupateli);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Нет MyPokupateli файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Ошибка ввода данных", ex);
        }
    }

    public Pokupatel[] loadPokupateli() {
        Pokupatel[] pokupateli = new Pokupatel[0];
        try {
            FileInputStream fileInputStream = new FileInputStream("MyPokupateli");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            pokupateli = (Pokupatel[]) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE,"Нет файла MyPokupateli", ex);
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Ошибка ввода/вывода", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return pokupateli;
    }


    public void savePurchases(Purchase[] purchases) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("MyPurchases");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(purchases);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Нет MyPurchases файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "Ошибка ввода данных", ex);
        }
    }
    
    public Purchase[] loadPurchases() {
        Purchase[] purchases = new Purchase[0];
        try {
            FileInputStream fileInputStream = new FileInputStream("MyPurchases");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            purchases = (Purchase[]) objectInputStream.readObject();
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
