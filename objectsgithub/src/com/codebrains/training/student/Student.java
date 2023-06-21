/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codebrains.training.student;

/**
 *
 * @author hp
 */
public class Student {
    
    int rno;
    String name;
    String branch;
    int m1, m2;

    public int getTotal() {
        return m1 + m2;
    }

    public void setDetails(int sno, String na, String br, int sub1, int sub2) {
        rno = sno;
        name = na;
        branch = br;
        m1 = sub1;
        m2 = sub2;
    }

    public static void main(String args[]) {
        Student stud1; //decladation
        stud1 = new Student();//instantiation
        stud1.setDetails(30, "divya", "btech", 32, 35); //initialization
        
        Student stud2;
        stud2 = new Student();
        stud2.setDetails(3, "divyanjali", "bcom", 34, 35);
        
        int tot = stud1.getTotal();//Accessing
        System.out.println("first student total marks=" + tot);
        tot = stud2.getTotal();
        System.out.println("second student totl marks=" + tot);
        
        stud1=null;//Destroy
        stud2=null;
    }
}
