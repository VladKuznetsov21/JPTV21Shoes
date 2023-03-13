/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Pokupatel;
import java.util.List;
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
        System.out.print("Телефон: ");
        pokupatel.setPhone(scanner.nextLine());
        System.out.print("Деньги: ");
        pokupatel.setMoney(scanner.nextLine());
        return pokupatel;
    }
    
    public void printListPokupateli(List<Pokupatel> pokupateli) {
        for (int i = 0; i < pokupateli.size(); i++) {
            Pokupatel pokupatel = pokupateli.get(i);
            System.out.printf(i+1+".%s %s %s %s%n"
                    ,pokupatel.getFirstname()
                    ,pokupatel.getLastname()
                    ,pokupatel.getPhone()
                    ,pokupatel.getMoney()
                    
            );
        }
    }
    
    public List<Pokupatel> AddMoneyPokupatel(List<Pokupatel> pokupateli){
        System.out.println("Список покупателей");
        printListPokupateli(pokupateli);
        System.out.print("Добавить денег покупателю номер: ");
        int numberPokupatel = scanner.nextInt();scanner.nextLine();
        System.out.println("Введите количество денег: ");
        pokupateli.get(numberPokupatel - 1).setMoney(scanner.nextLine());
        
        return pokupateli;
    }    

    

    
}