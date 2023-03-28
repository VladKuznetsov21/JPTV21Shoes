/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author pupil
 */
@Entity
public class Purchase implements Serializable{
    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @OneToOne()
    private Pokupatel pokupatel;
    @OneToOne()
    private Product product;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date TakeOnProduct;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
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
    
    public Date getReturnProduct() {
        return ReturnProduct;
    }

    public void setReturnProduct(Date ReturnProduct) {
        this.ReturnProduct = ReturnProduct;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Purchase{" 
                + "id=" + id 
                + ", pokupatel=" + pokupatel 
                + ", product=" + product 
                + ", TakeOnProduct=" + TakeOnProduct 
                + ", ReturnProduct=" + ReturnProduct 
                + ", quantity=" + quantity 
                + '}';
    }

}
