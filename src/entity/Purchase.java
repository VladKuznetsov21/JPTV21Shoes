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
}