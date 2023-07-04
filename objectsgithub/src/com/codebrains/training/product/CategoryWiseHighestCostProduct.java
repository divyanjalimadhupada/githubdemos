/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebrains.training.product.modified;

import com.codebrains.training.product.dto.Product;
import java.util.Scanner;

public class CategoryWiseHighestCostProduct {

    public static void main(String[] args) {
        
        Product array[] = new Product[3];
        for (int i = 0; i < array.length; i++) {
            Product prod = new Product();
            prod.setDetails();
            array[i] = prod;
        }
        System.out.println("Product Details");
        System.out.println("sno\tproductname\tcategory\tprice\tquantity");
        for (int i = 0; i < array.length; i++) {
            Product prod = array[i];
            System.out.println(prod.sno + "\t\t" + prod.productname + "\t\t" + prod.category + "\t\t" + prod.price + "\t\t" + prod.quantity);
        }

        float highHouseHoldPrice = 0;
        float highEdiblePrice = 0;
        String houseHoldProdName=null,edibleProdName=null;
        for (int i = 0; i < array.length; i++) {
            Product prod = array[i];
            if (prod.category.equalsIgnoreCase("HouseHold")) {
                if (prod.price > highHouseHoldPrice) {
                    highHouseHoldPrice = prod.price;
                    houseHoldProdName=prod.productname;
                }
            } else {
                if(prod.price > highEdiblePrice) {
                    highEdiblePrice = prod.price;
                    edibleProdName=prod.productname;
                }
            }
        }
        System.out.println("In Household category highest price="+highHouseHoldPrice+"and product is"+houseHoldProdName);
        System.out.println("In edible category highest price="+highEdiblePrice+"and product is"+edibleProdName);
}
}