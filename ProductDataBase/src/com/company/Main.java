package com.company;


public class Main {

    public static void main(String[] args) {
        Product product = ProductDB.getProductByCode("jsp");
        System.out.println("PRODUCT BY CODE");
        System.out.println("Code:        ");
        System.out.println("Description: ");
        System.out.println("Price:       ");
        System.out.println("----------------------------------------------");
        
        product = ProductDB.getProductByIndex(0);
        System.out.println("PRODUCT BY INDEX");
        System.out.println("Code:        ");
        System.out.println("Description: ");
        System.out.println("Price:       ");
        System.out.println("----------------------------------------------");
        
        Product[] products = ProductDB.getAllProducts();
        System.out.println("LIST OF ALL PRODUCTS");
        for (int i = 0; i < 3; i++) {
            System.out.println("Code:        ");
            System.out.println("Description: ");
            System.out.println("Price:       ");        
            System.out.println();
        }            
        System.out.println("----------------------------------------------");        
    }    
}