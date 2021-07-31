package com.company;

public class Main {

    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        Product product1 = new Product(1,"Lenovo S-145",15000,"Harika Yahu", 10);

        System.out.println(product1.getUnitPriceAfterDiscount());
        System.out.println(product1.getDetail());
        System.out.println(product1.getUnitPriceAfterDiscount());
        productManager.addToCart(product1);

    }
}
