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
    private Date date;
    private Date TakeOnProduct;
    private Date ReturnProduct;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTakeOnProduct() {
        return TakeOnProduct;
    }

    public void setTakeOnProduct(Date TakeOnProduct) {
        this.TakeOnProduct = TakeOnProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    @Override
    public String toString() {
        return "Purchase{" 
                + "pokupatel=" + pokupatel 
                + ", product=" + product 
                + ", date=" + date 
                + ", TakeOnProduct=" + TakeOnProduct 
                + ", quantity=" + quantity 
                + '}';
    }

    public Date getReturnProduct() {
        return ReturnProduct;
    }

    public void setReturnProduct(Date ReturnProduct) {
        this.ReturnProduct = ReturnProduct;
    }

 
    
    
    

}