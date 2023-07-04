/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codebrains.training.product.modified;

import com.codebrains.training.product.dto.Product;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class CountCategoriesDynamicallyArrayListModified {
    public static void main(String[] args) {

        ArrayList<Product> productsList = new ArrayList<Product>(5);
      
        Product prod1 = new Product(1, "biscuit", "edibles", 30, 2);
        productsList.add(prod1);
        Product prod2 = new Product(2, "toothpaste", "household", 50, 2);
        productsList.add(prod2);
        Product prod3 = new Product(3, "doraemon", "toys", 150, 2);
        productsList.add(prod3);
        Product prod4 = new Product(4, "shinchan", "toys", 150, 2);
        productsList.add(prod4);
        Product prod5 = new Product(5, "doormats", "household", 150, 2);
        productsList.add(prod5);

        ArrayList<String> unqueCategory= new ArrayList<String>();
        for (Product prod : productsList) {  //for each
            if(unqueCategory.contains(prod.category)==false){
                unqueCategory.add(prod.category);
            }
        }

        System.out.println("total no of categories");
        for (String category: unqueCategory) {  //for each
             System.out.println(category);
        }
    }
}
