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
public class StudentConstructor {
    int rno;
    String name;
    String branch;
    int m1, m2;

    public int getTotal() {
        return m1 + m2;
    }

    public StudentConstructor(int sno, String na, String br, int sub1, int sub2) {
        rno = sno;
        name = na;
        branch = br;
        m1 = sub1;
        m2 = sub2;
    }

    public static void main(String args[]) {
        StudentConstructor stud1 = new StudentConstructor(30, "divya", "btech", 32, 89);
        StudentConstructor stud2 = new StudentConstructor(3, "divyanjali", "bcom", 56, 35);
     
        
        int tot = stud1.getTotal();//Accessing
        System.out.println("first student total marks=" + tot);
        tot = stud2.getTotal();
        System.out.println("second student totl marks=" + tot);
        
        stud1=null;//Destroy
        stud2=null;
    }
    
}
