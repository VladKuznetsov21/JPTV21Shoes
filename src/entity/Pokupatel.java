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
public class Pokupatel {
    private String firstname;
    private String lastname;
    private String isikukood;

    public Pokupatel() {
    }

    public Pokupatel(String firstname, String lastname, String isikukood) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.isikukood = isikukood;
    }

    public Pokupatel(String vlad, String kuznetsov, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    @Override
    public String toString() {
        return "Pokupatel{" 
                + "firstname=" + firstname 
                + ", lastname=" + lastname 
                + '}';
    }

}

