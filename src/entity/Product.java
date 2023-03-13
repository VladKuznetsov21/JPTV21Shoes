/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;


import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 *
 * @author pupil
 */
@Entity
public class Product implements Serializable {
    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    @OneToMany(cascade = {CascadeType.PERSIST})
    private String price;
    private String fabricator;
    private List<Pokupatel> pokupateli;
    private int quantity;
    private int count;
    private int length;

    public Product() {
    }
         
    public List<Pokupatel> getPokupateli() {
        return pokupateli;
    }

    public void setPokupateli(List<Pokupatel> pokupateli) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" 
                + "id=" + id 
                + ", name=" + name 
                + ", price=" + price 
                + ", fabricator=" + fabricator 
                + ", pokupateli=" + pokupateli 
                + ", quantity=" + quantity 
                + ", count=" + count 
                + ", length=" + length 
                + '}';
    }

    public Object getokupateli() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}