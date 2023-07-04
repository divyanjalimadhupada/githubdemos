package com.codebrains.training.product.modified;

import com.codebrains.training.product.dto.Product;
import java.util.Scanner;

public class CountCategories {

    public static void main(String[] args) {

        Product array[] = new Product[4];
        for (int i = 0; i < array.length; i++) {
            Product prod = new Product();
            prod.setDetails();
            array[i] = prod;
        }

        int count1 = 0, count2 = 0, count3 = 0;
        int countCategory = 0;
        for (int i = 0; i < array.length; i++) {
            Product prod = array[i];
            if (prod.category.equalsIgnoreCase("HouseHold")) {
                count1 = count1 + 1;
            }

           else if (prod.category.equalsIgnoreCase("edibles")) {
                count2 = count2 + 1;
            }

           else if (prod.category.equalsIgnoreCase("toys")) {
                count3 = count3 + 1;
            }
        }
        if (count1 > 0) {
            countCategory = countCategory + 1;
            System.out.println("category: household"+count1);
        }
        if (count2 > 0) {
            countCategory = countCategory + 1;
            System.out.println("category: edibles"+ count3);
        }
        if (count3 > 0) {
            countCategory = countCategory + 1;
            System.out.println("category: toys"+count3);
        } 

        System.out.println(" total number of categories are  " + countCategory);
    }
}
