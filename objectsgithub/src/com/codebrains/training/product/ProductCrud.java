/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebrains.training.product;

import com.codebrains.training.product.dto.Product;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductCrud {

    public static Product getProduct(ArrayList<Product> ProductList, int sno) {
        for (Product product : ProductList) {  //for each
            if (product.sno == sno) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Product> ProductList = new ArrayList<Product>(5);
        Scanner scan = new Scanner(System.in);
        char isContinue;
        do {
            System.out.println("\tMenu");
            System.out.println("1.Adding");
            System.out.println("2.Retrieval");
            System.out.println("3.Search");
            System.out.println("4.Update");
            System.out.println("5.Delete");
            System.out.print("Select The Opttion : ");
            int option = 0;
            try {
                option = scan.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Please Check Your Options");
            }

            switch (option) {
                case 1:
                    Product prod = new Product();
                    prod.setDetails();
                    ProductList.add(prod);
                    break;
                case 2:
                    System.out.println("sno\tproduct Name\tcategory\tprice\tquantity");
                    for (Product product : ProductList) {  //for each
                        System.out.println(product.sno + "\t" + product.productName + "\t" + product.category + "\t" + product.price + "\t" + product.quantity);
                    }
                    break;
                case 3:
                    System.out.print("What is your Product sno: ");
                    int sno = scan.nextInt();
                    Product productObject = getProduct(ProductList, sno);
                    if (productObject != null) {
                        System.out.println("sno\\tproduct Name\\tcategory\\tprice\\tquantity");
                        System.out.println(productObject.sno + "\t\t" + productObject.productName + "\t\t" + productObject.category + "\t\t" + productObject.price + "\t\t" + productObject.quantity);
                    } else {
                        System.out.println("There is no Product with that sno: " + sno);
                    }

                    break;
                case 4:
                    System.out.print("What is your Product sno: ");
                    sno = scan.nextInt();
                    System.out.print("Enter price for updation:  ");
                    int price = scan.nextInt();
                    productObject = getProduct(ProductList, sno);
                    if (productObject != null) {
                        productObject.price = price;
                        System.out.println("Updated Succesfully");
                    } else {
                        System.out.println("There is no product with this sno: " + sno);
                    }
                    break;
                case 5:
                    System.out.print("What is your Product sno: ");
                    sno = scan.nextInt();
                    productObject = getProduct(ProductList, sno);
                    if (productObject != null) {
                        ProductList.remove(productObject);
                        System.out.println("Deleted Successfully");
                        break;
                    } else {
                        System.out.println("There is no Product with this sno: " + sno);
                    }
                    break;
                default:
                    System.out.println("There is no Option with this " + option + " choice");
            }

            System.out.println("You Want to Continue(y/n)");
            isContinue = scan.next().charAt(0);

        } while (isContinue != 'n');
    }
}
