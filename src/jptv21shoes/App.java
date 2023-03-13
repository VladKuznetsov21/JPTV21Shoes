/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21shoes;

import entity.Market;
import entity.Pokupatel;
import entity.Product;
import entity.Purchase;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static javafx.beans.binding.Bindings.length;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;
import managers.DataManager;
import managers.PokupatelManager;
import managers.ProductManager;
import managers.PurchaseManager;
    
/**
 *
 * @author pupil
 */
public class App {
    //private Product[] products;
    private List<Product> products;
    //private Pokupatel[] pokupateli;
    private List<Pokupatel> pokupateli;
    //private Purchase[] purchase;
    private List<Purchase> purchases;
    private Market[] markets;
    private final PokupatelManager pokupatelManager;
    private final PurchaseManager purchaseManager;
    private final ProductManager productManager;
    private final DataManager dataManager;

    
    public App() {
    dataManager = new DataManager();  
    this.products = dataManager.loadproducts();
    this.pokupateli = dataManager.loadPokupateli();
    this.purchases = dataManager.loadPurchases();
    pokupatelManager = new PokupatelManager();
    productManager = new ProductManager();
    purchaseManager = new PurchaseManager();
   
}
    
    public void run(){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Список задач: ");
            System.out.println("1. Выход из программы");
            System.out.println("2. Добавить продукт");
            System.out.println("3. Список продаваемых продуктов");
            System.out.println("4. Добавить покупателя");
            System.out.println("5. Список зарегистрированных покупателей");
            System.out.println("6. Покупка покупателем продукта");
            System.out.println("7. Оборот магазина за все время работы");
            System.out.println("8. Добавить денег покупателю");
            System.out.print("Выберите задачу из списка: ");
            int task = scanner.nextInt(); scanner.nextLine();
            System.out.println("=======================================");
            switch (task) {
                case 1:
                    repeat = false;
                    System.out.println("1. Выход из программы");
                    break;
                case 2:
                    System.out.println("2. Добавить продукт");
                    // Добавляет продукт в список товароы маагзина 
                    //this.products = Arrays.copyOf(this.products, this.products.length + 1);
                    //this.products[this.products.length-1] = productManager.createProduct();
                    
                    products.add(productManager.createProduct());
                    dataManager.saveProducs(products);
                    break;
                case 3:
                    System.out.println("3. Список продаваемых продуктов");
                    // Показывает список проданных товаров покупателю
                    productManager.printListProducts(products);
                    break;
                case 4:
                    System.out.println("4. Добавить покупателя");
                    // Добавляет покупателя купившего продукт в списке магазина
                    //this.pokupateli = Arrays.copyOf(this.pokupateli, this.pokupateli.length + 1);
                    //this.pokupateli[this.pokupateli.length - 1] = pokupatelManager.createPokupatel();
                    
                    pokupateli.add(pokupatelManager.createPokupatel());
                    dataManager.savePokupateli(pokupateli);
                    break;
                case 5:
                    System.out.println("5. Список зарегистрированных покупателей");
                    // Показывает прокупателей купивших тот или иной товар
                    pokupatelManager.printListPokupateli(pokupateli);
                    break;
                case 6:
                    System.out.println("6. Покупка покупателем продукта");
                    // Покупатель покупает товар и с его счёта вычетаются денги
                    //purchases = Arrays.copyOf(this.purchases, this.purchases.length + 1);
                    //this.purchases(this.purchases.length - 1) = purchaseManager.buyProduct(products, pokupateli);
                    
                    this.purchases.add(purchaseManager.buyProduct(products, pokupateli));
                    dataManager.savePurchases(purchases);
                    break;
                case 7:
                    System.out.println("7. Оборот магазина за все время работы");
                    purchaseManager.marketCashList(purchases);
                    break;
                case 8:
                    System.out.println("8. Добавить денег покупателю");
                    this.pokupateli = pokupatelManager.AddMoneyPokupatel(pokupateli);
                    break;
            }
            System.out.println("=======================================");
        }while(repeat);
        System.out.println("Пока, ребята!");
    }

}

    
    