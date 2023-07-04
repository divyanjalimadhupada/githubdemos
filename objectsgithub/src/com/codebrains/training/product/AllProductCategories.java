/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebrains.training.product.modified;

import com.codebrains.training.product.dto.Product;

public class AllProductCategories {

    public static void main(String[] args) {

        Product array[] = new Product[5];
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
    String category[]=new String[5];
    for(int i=0;i<array.length;i++){
        Product prod=array[i];
        category[i]=prod.category;
    }
    int k=0;
        String uniqueCategory[]=new String[5];
        for(int i=0;i<array.length;i++){
            int isthere=0;
            for(int j=0;j<k;j++){
                if(category[i].equalsIgnoreCase(uniqueCategory[j])){
                    isthere=1;
                    break;
                }
            }
        if(isthere==0){
            uniqueCategory[k]=category[i];
            k++;
        }}
        System.out.println("after removing dupliocate categories");
        for(int i=0;i<k;i++){
            System.out.println(uniqueCategory[i]);
        }
    
    
    }
}
