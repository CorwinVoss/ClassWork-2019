package com.company;

public class ProductDB {
    private static String[][] productsArray = {
        {"java", "Murach's Java Programming", "57.50"},
        {"jsp", "Murach's Java Servlets and JSP", "57.50"},
        {"mysql", "Murach's MySQL", "54.50"}
    };
    
    public static Product getProductByIndex(int i) {
        // TODO: Add code here to return Product object
        return productsArray;
    }
    
    public static Product getProductByCode(String code) {
        // TODO: Add code here to return Product object
        return null;
    }
    
    public static Product[] getAllProducts() {
        // TODO: Add code here to return array of Product objects
        return null;
    }
}