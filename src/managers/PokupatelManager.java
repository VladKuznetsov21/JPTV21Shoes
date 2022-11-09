/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Pokupatel;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class PokupatelManager {
    private final Scanner scanner = new Scanner(System.in);
    public Pokupatel createPokupatel(){
        Pokupatel pokupatel = new Pokupatel();
        System.out.print("Имя: ");
        pokupatel.setFirstname(scanner.nextLine());
        System.out.print("Фамилия: ");
        pokupatel.setLastname(scanner.nextLine());
        System.out.print("Телефон покупателя: ");
        pokupatel.setPhone(scanner.nextLine());
        return pokupatel;
    }
    
    public void printListPokupateli(Pokupatel[] pokupateli) {
        for (int i = 0; i < pokupateli.length; i++) {
            Pokupatel pokupatel = pokupateli[i];
            System.out.printf(i+1+".%s %s %s%n"
                    ,pokupatel.getFirstname()
                    ,pokupatel.getLastname()
            );
        }
    }
}