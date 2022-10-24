/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

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
        System.out.print("Vvedite nazvanie Producta: ");
        product.setTitle(scanner.nextLine());
        System.out.print("Vvedite chislo Product: ");
        int countProdavchiInProduct = scanner.nextInt();
        scanner.nextLine();
        product.setProdavchi(createProdavchi(countProdavchiInProduct));
        return product;
    }
    
}
