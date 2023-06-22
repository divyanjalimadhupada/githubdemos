/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebrains.training.product.modified;

import com.codebrains.training.product.dto.Product;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ViewCategoryWiseProducts {

    public static void main(String args[]) {
        Product array[] = new Product[3];
        Product prod1 = new Product(1, "biscuit", "edibles", 30, 2);
        array[0] = prod1;
        Product prod2 = new Product(2, "toothpaste", "household", 50, 2);
        array[1] = prod2;
        Product prod3 = new Product(3, "shampoo", "household", 150, 2);
        array[2] = prod3;

        int count1 = 0, count2 = 0;

        System.out.println("household DETAILS");
        for (int i = 0; i < array.length; i++) {
            Product prod = array[i];
            if (prod.category.equalsIgnoreCase("household")) {
                System.out.println(prod.sno + " \t " + prod.productname);
                count1 = count1 + 1;
            }
        }
        if (count1
                > 0) {
            System.out.println("Nof Household Products =" + count1);
        }

        System.out.println("edibles DETAILS");
        for (int i = 0; i < array.length;i++) {
            Product prod = array[i];
            if (prod.category.equalsIgnoreCase("edibles")) {
                System.out.println(prod.sno + " \t " + prod.productname);
                count2 = count2 + 1;
            }
        }
        if (count2> 0) {
            System.out.println("Nof Edibles Products =" + count2);
        }

    }

}
