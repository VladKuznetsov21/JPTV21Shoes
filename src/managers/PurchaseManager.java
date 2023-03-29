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
        purchase.setReturnProduct(new GregorianCalendar().getTime());
        purchase.setTakeOnProduct(new GregorianCalendar().getTime());
        return purchase;
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