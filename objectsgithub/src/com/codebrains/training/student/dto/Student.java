/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codebrains.training.student.dto;

import java.util.Scanner;


/**
 *
 * @author hp
 */
public class Student {
    
   public int rno;
    public String name;
    public String branch;
   public int m1, m2;

    public int getTotal() {
        return m1 + m2;
    }

    public void setDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Rollno");
        rno = scan.nextInt();
        System.out.println("Enter Name");
        name = scan.next();
        System.out.println("Enter BRANCH");
        branch = scan.next();
        System.out.println("Enter Sub1");
        m1 = scan.nextInt();
        System.out.println("Enter Sub2");
        m2 = scan.nextInt();
    }

   
}
