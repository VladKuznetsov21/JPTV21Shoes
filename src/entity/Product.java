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
    private String fabricator;
    private Pokupatel[] pokupateli;
    private int quantity;
    private int count;
    private int length;

    public Product() {
    }

    public Product(String name, String price, String fabricator, Pokupatel[] pokupateli, int quantity, int count, int length) {
        this.name = name;
        this.price = price;
        this.fabricator = fabricator;
        this.pokupateli = pokupateli;
        this.quantity = quantity;
        this.count = count;
        this.length = length;
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
    public String getFabricator() {
        return fabricator;
    }

    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.count = quantity;
    }

    public int getCount() {
        return count;
    }

    public  void setCount(int count) {
        this.count = count;
    }
    public boolean countPluss(){
        if(count < quantity){
            count++;
            return true;
        }
        return false;
    }
    public boolean countMinuss(){
        if(count > 0){
            count--;
            return true;
        }
        return false;
    }

    public void quantityPluss(int number) {
        quantity += number;
        count += number;
    }

    public void quantityMinus(int number) {
        quantity -= number;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Product{" 
                + "name=" + name 
                + ", price=" + price 
                + ", fabricator=" + fabricator 
                + ", pokupateli=" + Arrays.toString(pokupateli)
                + ", quantity=" + quantity 
                + ", count=" + count 
                + ", length=" + length 
                + '}';
    }
    
    
    

    

  
    
    

}