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
public class StudHighestMarks {

    int rno;
    String name;
    String branch;
    int m1, m2;

    public int getTotal() {
        return m1 + m2;
    }

    public StudHighestMarks() {
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
        StudHighestMarks array[] = new StudHighestMarks[3];
        for (int i = 0; i < array.length; i++) {
            StudHighestMarks stud = new StudHighestMarks();
            array[i] = stud;
        }
        int big = 0;
        StudHighestMarks highStudent=null;
        for (int i = 0; i < array.length; i++) {
            StudHighestMarks stud = array[i];
            int tot = stud.getTotal();//Accessing
            if (tot > big) {
                big=tot;
                highStudent=stud;
            }
        }
        
        System.out.println(highStudent.name +" got highest marks "+highStudent.getTotal());
    }

}
