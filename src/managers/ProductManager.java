/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Pokupatel;
import entity.Product;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ProductManager {
    private Scanner scanner;

    public ProductManager() {
        this.scanner = new Scanner(System.in);
    }
    
    public Product createProduct(){
        Product product = new Product();
        System.out.print("Введите название продукта: ");
        product.setName(scanner.nextLine());
        System.out.print("Введите цену продукта: ");
        product.setPrice(scanner.nextLine());
        System.out.print("Введите колличество продукта: ");
        product.setQuantity(scanner.nextLine());
        System.out.print("Введите производителя продукта: ");
        product.setFabricator(scanner.nextLine());
        return product;
    }

    public void printListProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if(product.getCount() < 1) continue;
            System.out.printf(i+1+". Product{title = %s%n",product.getTitle());
            System.out.print("\tProducts = [\n");
            for (int j = 0; j < product.getPokupateli().length; j++) {
                Pokupatel pokupatel = product.getPokupateli()[j];
                System.out.printf("\t\t%s %s%n"
                        ,pokupatel.getFirstname(),pokupatel.getLastname());
            }
            System.out.println("\t]");
        }
        System.out.println("   }");
    }
    
}
            