/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21shoes;

import entity.Pokupatel;
import entity.Product;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;
import managers.PokupatelManager;
import managers.ProductManager;
    
/**
 *
 * @author pupil
 */
public class App {
    private Product[] products;
    private Pokupatel[] pokupateli;
    private final PokupatelManager pokupatelManager;
    private final ProductManager productManager;
    
    public App() {
    this.products = new Product[0];
    this.pokupateli = new Pokupatel[0];
    pokupatelManager = new PokupatelManager();
    productManager = new ProductManager();
    
}
    
public void run() throws ParseException{
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Список задач: ");
            System.out.println("1. Võhod iz programmõ");
            System.out.println("2. Dobavit produkt");
            System.out.println("3. Spisok prodavaemõh produkt");
            System.out.println("4. Dobavit pokupatela");
            System.out.println("5. Spisok zaregistrirovannõh pokupatelei");
            System.out.println("6. Pokupka pokupatelem produkta");
            System.out.println("7. Dohod magazina za vse vrema rabotõ");
            System.out.println("8. Dobavit deneg pokupately");
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println("=====================================");
            switch (task) {
                case 1:
                    repeat = false;
                    System.out.println("1. Võhod iz programmõ");
                    break;
                case 2:
                    System.out.println("2. Dobavit produkt");
                    this.products = Arrays.copyOf(this.products, this.products.length+1);
                    this.products[this.products.length-1] = productManager.createProduct();
                    break;
                case 3:
                    System.out.println("3. Spisok prodavaemõh produktov");
                    productManager.printListProducts(products);
                    break;
                case 4:
                    System.out.println("4. dobavit pokupatela");
                    this.pokupateli = Arrays.copyOf(this.pokupateli, this.pokupateli.length+1);
                    this.pokupateli[this.pokupateli.length-1] = pokupatelManager.createPokupatel();
                    break;
                case 5:
                    System.out.println("5. Spisok zaregistrirovannõh pokupatelei");
                    
                    break;
                case 6:
                    System.out.println("6. Pokupka pokupatelem produkta");
                    
                    break;
                case 7:
                    System.out.println("7. Dohod magazina za vse vrema rabotõ");
                    
                    break;
                case 8:
                    System.out.println("8. Dobavit deneg pokupately");
                    
                    break;
            }
            System.out.println("=======================================");
    }while(repeat);
    System.out.println("Пока, ребята!");
    }

}

    
    