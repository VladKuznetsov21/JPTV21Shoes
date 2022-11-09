/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class Product {
    private String name;
    private String price;
    private String quantity;
    private String fabricator;

    public Product() {
    }
    
    public Product(String name, String price, String quantity, String fabricator) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.fabricator = fabricator;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    public String getFabricator() {
        return fabricator;
    }

    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }
    
    @Override
    public String toString() {
        return "Product{" 
                + "name=" + name 
                + "price=" + price
                + "quantity=" + quantity
                + "fabricator=" + fabricator
                + '}';
    }

}