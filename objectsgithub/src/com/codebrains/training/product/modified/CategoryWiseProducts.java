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
public class CategoryWiseProducts {
    public static void main(String args[]) {
        Product array[] = new Product[3];
        for (int i = 0; i < array.length; i++) {
            Product prod = new Product();
            prod.setDetails();
            array[i] = prod;
        }

        for (int i = 0; i < array.length; i++) {
            Product prod = array[i];
            
        }

    }
    
    
}
