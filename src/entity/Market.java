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
public class Market {

    private int cashMarket;


    public int getCashMarket() {
        return cashMarket;
    }

    public void setCashMarket(int cashMarket) {
        this.cashMarket = cashMarket;
    }
    @Override
    public String toString() {
        return "Market{" +
                "cashMarket=" + cashMarket +
                '}';
    }
}

