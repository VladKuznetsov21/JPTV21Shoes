/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author pupil
 */
@Entity
public class Pokupatel implements Serializable {
    @Id
    private Long id;
    private String firstname;
    private String lastname;
    private String phone;
    private String money;

    public Pokupatel() {
    }

    public Pokupatel(String firstname, String lastname, String phone, String money) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.money = money;
        
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getMoney() {
        return money;
    }
   
    public void setMoney(String money) {
        int intMoney = Integer.parseInt(money);
        Integer fieldMoney = Integer.parseInt(money);
        fieldMoney += intMoney;
        this.money = fieldMoney.toString();
    }
    
    @Override
    public String toString() {
        return "Pokupatel{" 
                + "firstname=" + firstname 
                + ", lastname=" + lastname 
                + ", phone=" + phone
                + ", money=" + money
                + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

}

