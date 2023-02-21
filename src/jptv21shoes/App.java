/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21shoes;

import entity.Pokupatel;
import entity.Product;
import entity.Purchase;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;
import managers.PokupatelManager;
import managers.ProductManager;
import managers.PurchaseManager;
    
/**
 *
 * @author pupil
 */
public class App {
    private Product[] products;
    private Pokupatel[] pokupateli;
    private Purchase[] purchase;
    private final PokupatelManager pokupatelManager;
    private final PurchaseManager purchaseManager;
    private final ProductManager productManager;
    
    public App() {
    this.products = new Product[0];
    this.pokupateli = new Pokupatel[0];
    this.purchase = new Purchase[0];
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
            System.out.println("=====================================");
            switch (task) {
                case 1:
                    repeat = false;
                    System.out.println("1. Выход из программы");
                    break;
                case 2:
                    System.out.println("2. Добавить продукт");
                    // Добавляет продукт в список товароы маагзина 
                    this.products = Arrays.copyOf(this.products, this.products.length+1);
                    this.products[this.products.length-1] = productManager.createProduct();
                    break;
                case 3:
                    System.out.println("3. Список продаваемых продуктов");
                    // Показывает список проданных товаров покупателю
                    productManager.printListProducts(products);
                    break;
                case 4:
                    System.out.println("4. Добавить покупателя");
                    // Добавляет покупателя купившего продукт в списке магазина
                    this.pokupateli = Arrays.copyOf(this.pokupateli, this.pokupateli.length+1);
                    this.pokupateli[this.pokupateli.length-1] = pokupatelManager.createPokupatel();
                    break;
                case 5:
                    System.out.println("5. Список зарегистрированных покупателей");
                    // Показывает прокупателей купивших тот или иной товар
                    pokupatelManager.printListPokupateli(pokupateli);
                    break;
                case 6:
                    System.out.println("6. Покупка покупателем продукта");
                    // Покупатель покупает товар и с его счёта вычетаются денги
                    this.purchase = Arrays.copyOf(this.purchase, this.purchase.length + 1);
                    this.purchase[this.purchase.length - 1] = purchaseManager.buyProduct(products, pokupateli);
                    break;
                case 7:
                    System.out.println("7. Оборот магазина за все время работы");
                    
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

    
    