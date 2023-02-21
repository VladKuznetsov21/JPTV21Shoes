/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class Product {
    private String name;
    private String price;
    private String quantity;
    private String fabricator;
    private String title;
    private Pokupatel[] pokupateli;
    private int count;

    public Product() {
    }
    
    public Product(String name, String price, String quantity, String fabricator) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.fabricator = fabricator;
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Pokupatel[] getPokupateli() {
        return pokupateli;
    }

    public void setPokupateli(Pokupatel[] pokupateli) {
        this.pokupateli = pokupateli;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" 
                + "name=" + name 
                + ", price=" + price 
                + ", quantity=" + quantity 
                + ", fabricator=" + fabricator 
                + ", title=" + title 
                + ", pokupateli=" + pokupateli 
                + ", count=" + count + '}';
    }

    public Object getPokupatel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}