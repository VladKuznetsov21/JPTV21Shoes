/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author pupil
 */
public class Purchase {
    private Pokupatel pokupatel;
    private Product product;
    private Date takeOnProduct;
    private int quantity;


    public Purchase() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Pokupatel getPokupatel() {
        return pokupatel;
    }

    public void setPokupatel(Pokupatel pokupatel) {
        this.pokupatel = pokupatel;
    }

    public Date getTakeOnProduct() {
        return takeOnProduct;
    }

    public void setTakeOnProduct(Date takeOnProduct) {
        this.takeOnProduct = takeOnProduct;
    }
 
    
    @Override
    public String toString() {
        return "Purchase{" 
                + "product=" + product
                + ", pokupatel=" + pokupatel 
                + ", takeOnProduct=" + takeOnProduct
                + '}';
    }

    public void setReader(Pokupatel pokupatel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getReturnProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}