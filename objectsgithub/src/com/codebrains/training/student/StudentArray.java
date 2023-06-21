/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebrains.training.student;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class StudentArray {

    int rno;
    String name;
    String branch;
    int m1, m2;

    public int getTotal() {
        return m1 + m2;
    }

    public StudentArray() {
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

    public static void main(String args[]) {
        StudentArray array[] = new StudentArray[10];
        for (int i = 0; i < array.length; i++) {
            StudentArray stud = new StudentArray();
            array[i] = stud;
        }

        for (int i = 0; i < array.length; i++) {
            StudentArray stud = array[i];
            int tot = stud.getTotal();//Accessing
            System.out.println((i + 1) + " student total marks=" + tot);
        }

    }

}
