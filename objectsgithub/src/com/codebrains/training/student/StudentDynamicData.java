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
public class StudentDynamicData {

    int rno;
    String name;
    String branch;
    int m1, m2;

    public int getTotal() {
        return m1 + m2;
    }

    public StudentDynamicData() {
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
        StudentDynamicData stud1 = new StudentDynamicData();
        StudentDynamicData stud2 = new StudentDynamicData();

        int tot = stud1.getTotal();//Accessing
        System.out.println("first student total marks=" + tot);
        tot = stud2.getTotal();
        System.out.println("second student totl marks=" + tot);

        stud1 = null;//Destroy
        stud2 = null;
    }
}
