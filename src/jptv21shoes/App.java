/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21shoes;


import entity.Pokupatel;
import entity.Product;
import entity.Purchase;
import java.util.List;
import java.util.Scanner;
import managers.DataManager;
import managers.PokupatelManager;
import managers.ProductManager;
import managers.PurchaseManager;
    
/**
 *
 * @author pupil
 */
public class App {
    
    //private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTV21Shoes_KuznetsovPU");
    //private EntityManager em = emf.createEntityManager();
    //private EntityTransaction tx = em.getTransaction();
   // private Product[] products;
    private List<Product> products;
    //private Pokupatel[] pokupateli;
    private List<Pokupatel> pokupateli;
    //private Purchase[] purchases;
    private List<Purchase> purchases;
    private final PokupatelManager pokupatelManager;
    private final PurchaseManager purchaseManager;
    private final ProductManager productManager;
    private final Scanner scanner;
    private DataManager dataManager;
    
    public App() {
    scanner = new Scanner(System.in);
    //this.products = new Product[0];
    this.products = dataManager.loadProducts();
    //this.pokupateli = new Pokupatel[0];
    this.pokupateli = dataManager.loadPokupateli();
    //this.purchases = new Purchase[0];
    this.purchases = dataManager.loadPurchases();
    pokupatelManager = new PokupatelManager();
    productManager = new ProductManager();
    purchaseManager = new PurchaseManager();
    dataManager = new DataManager();
    
}
    
    public void run(){
        boolean repeat = true;  
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
                    products.add(productManager.createProduct());
                    dataManager.saveProducts(this.products);
                    break;
                case 3:
                    System.out.println("3. Список продаваемых продуктов");
                    // Показывает список проданных товаров покупателю
                    productManager.printListProducts(products);                
                    break;
                case 4:
                    System.out.println("4. Добавить покупателя");
                    // Добавляет покупателя купившего продукт в списке магазина
                    this.pokupateli.add(pokupatelManager.createPokupatel());
                    dataManager.savePokupateli(this.pokupateli);
                    break;
                case 5:
                    System.out.println("5. Список зарегистрированных покупателей");
                    // Показывает прокупателей купивших тот или иной товар
                    pokupatelManager.printListPokupateli(pokupateli);
                    break;
                case 6:
                    System.out.println("6. Покупка покупателем продукта");
                    // Покупатель покупает товар и с его счёта вычетаются денги
                    this.purchases.add(purchaseManager.buyProduct(products, pokupateli));
                    dataManager.savePurchases(this.purchases);
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

    
    