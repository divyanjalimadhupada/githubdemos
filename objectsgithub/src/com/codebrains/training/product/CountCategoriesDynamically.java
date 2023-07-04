package com.codebrains.training.product.modified;

import com.codebrains.training.product.dto.Product;

public class CountCategoriesDynamically {

    public static void main(String[] args) {

        Product array[] = new Product[5];

        Product prod1 = new Product(1, "biscuit", "edibles", 30, 2);
        array[0] = prod1;
        Product prod2 = new Product(2, "toothpaste", "household", 50, 2);
        array[1] = prod2;
        Product prod3 = new Product(3, "doraemon", "toys", 150, 2);
        array[2] = prod3;
        Product prod4 = new Product(4, "shinchan", "toys", 150, 2);
        array[3] = prod4;
        Product prod5 = new Product(5, "doormats", "household", 150, 2);
        array[4] = prod5;

        String category[] = new String[5];
        for (int i = 0; i < array.length; i++) {
            Product prod = array[i];
            category[i] = prod.category;
        }

        int isthere, k = 0;
        String uniqueCategory[] = new String[5];
        for (int i = 0; i < category.length; i++) {
            isthere = 0;
            for (int j = 0; j < k; j++) {
                if (category[i].equalsIgnoreCase(uniqueCategory[j])) {
                    isthere = 1;
                    break;
                }
            }
            if (isthere == 0) {
                uniqueCategory[k] = category[i];
                k++;

            }
        }
        
        System.out.println("total no of categories");
        for (int i = 0; i < k; i++) {
            System.out.println(uniqueCategory[i]);

        }
    }

}
