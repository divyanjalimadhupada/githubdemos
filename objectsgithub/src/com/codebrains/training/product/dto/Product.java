package com.codebrains.training.product.dto;

import java.util.Scanner;

public class Product {

    public int sno;
    public String productname;
    public String category;
    public float price;
    public int quantity;

    public void setDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sno");
        sno = scan.nextInt();
        System.out.println("Enter product Name");
        productname = scan.next();
        System.out.println("Enter category");
        category = scan.next();
        System.out.println("Enter price");
        price = scan.nextInt();
        System.out.println("Enter quantity");
        quantity = scan.nextInt();
    }

    public Product() {

    }

    public Product(int pno, String name, String category, float cost, int qty) {
        sno = pno;
        productname = name;
        this.category = category;
        price = cost;
        quantity = qty;
    }

}
