/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Pokupatel;
import entity.Product;
import entity.Purchase;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class PurchaseManager {
    private final Scanner scanner = new Scanner(System.in);
    
    public Purchase takeOnBook(Product[] products,Pokupatel[] pokupateli){
        Purchase purchase = new Purchase();
        System.out.println("Список покупателей: ");
        PokupatelManager pokupatelManager = new PokupatelManager();
        pokupatelManager.printListPokupateli(pokupateli);
        System.out.print("Выберите номер покупателя из списка: ");
        int numberPokupatel = scanner.nextInt(); scanner.nextLine();
        
        System.out.println("Список продукта: ");
        ProductManager productManager = new ProductManager();
        productManager.printListProducts(products);
        System.out.print("Выберите номер продукта из списка: ");
        int numberProduct = scanner.nextInt(); scanner.nextLine();
        
        purchase.setProduct(products[numberProduct - 1]);
        purchase.setReader(pokupateli[numberPokupatel - 1]);
        purchase.setTakeOnProduct(new GregorianCalendar().getTime());
        return purchase;
    }

    public void printListTakeOnProducts(Purchase[] purchases){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        for (int i = 0; i < purchases.length; i++) {
            if(purchases[i].getReturnProduct() == null && purchases[i].getTakeOnProduct() != null){
                try {
                    System.out.printf("%d. %s. Выдана: %s. Книгу читает: %s %s%n"
                        ,i+1
                        ,purchases[i].getProduct().getName()
                        ,sdf.format(purchases[i].getTakeOnProduct())
                        ,purchases[i].getPokupatel().getFirstname()
                        ,purchases[i].getPokupatel().getLastname()
                        ,purchases[i].getPokupatel().getPhone()
                        ,purchases[i].getPokupatel().getMoney()
                    );
                } catch (Exception e) {
                    System.out.println("Неправильный формат даты!");
                    return;
                }
                
            }
        }
    }
}
