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
    private String title;
    private Pokupatel[] pokupateli;

    public Product() {
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

    public void setAuthors(Pokupatel[] pokupateli) {
        this.pokupateli = pokupateli;
    }
    
    public void addPokupatel(Pokupatel pokupatel){
        Pokupatel[] newPokupateli = Arrays.copyOf(pokupateli, pokupateli.length+1);
        newPokupateli[newPokupateli.length-1] = pokupatel;
        this.pokupateli = newPokupateli;
    }
    
    @Override
    public String toString() {
        return "Product{" 
                + "title=" + title 
                + ", pokupateli=" + Arrays.toString(pokupateli) 
                + '}';
    }

    public void setPokupateli(Pokupatel[] createPokupateli) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}