/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Market;
import entity.Pokupatel;
import entity.Product;
import entity.Purchase;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class PurchaseManager {
    private final Scanner scanner = new Scanner(System.in);
    
    public Purchase buyProduct(List<Product> products, List<Pokupatel> pokupateli){
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
        
        System.out.print("Выберите колличество продукта: ");
        int quantity = scanner.nextInt(); scanner.nextLine();
        
        purchase.setProduct(products.get(numberProduct - 1));
        purchase.setPokupatel(pokupateli.get(numberPokupatel - 1));
        purchase.setQuantity(quantity);
        purchase.setDate(new GregorianCalendar().getTime());
        return purchase;
    }

    public void printListTakeOnProducts(List<Purchase> purchases){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        for (int i = 0; i < purchases.size(); i++) {
            if(purchases.get(i).getReturnProduct() == null && purchases.get(i).getTakeOnProduct() != null){
                try {
                    System.out.printf("%d. %s. Выдана: %s. Продукт взят: %s %s%n"
                        ,i+1
                        ,purchases.get(i).getProduct().getName()
                        ,sdf.format(purchases.get(i).getTakeOnProduct())
                        ,purchases.get(i).getPokupatel().getFirstname()
                        ,purchases.get(i).getPokupatel().getLastname()
                        ,purchases.get(i).getPokupatel().getPhone()
                        ,purchases.get(i).getPokupatel().getMoney()
                    );
                } catch (Exception e) {
                    System.out.println("Неправильный формат даты!");
                    return;
                }
                
            }
        }
    }
    public void marketCashList(List<Purchase> purchases) {
        int sum = 0;
        for(int i = 0; i < purchases.size(); i++){
            Purchase purchase = purchases.get(i);
            sum = sum + Integer.parseInt(purchase.getProduct().getPrice()) * purchase.getQuantity();
        } 
        System.out.println("Оборот: "+sum);
    }

    

  

    
}