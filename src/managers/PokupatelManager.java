/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Pokupatel;
import java.util.Scanner;
import entity.Prodavech;

/**
 *
 * @author pupil
 */
public class PokupatelManager {
    private final Scanner scanner = new Scanner(System.in);
    public void createPokupatel(){
        Pokupatel pokupatel = new Pokupatel();
        System.out.print("Имя: ");
        pokupatel.setFirstname(scanner.nextLine());
        System.out.print("Фамилия: ");
        pokupatel.setLastname(scanner.nextLine());
    }
}