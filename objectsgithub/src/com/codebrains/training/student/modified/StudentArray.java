/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Teplates
 * and open the template in the editor.
 */
package com.codebrains.training.student.modified;

import com.codebrains.training.student.dto.Student;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class StudentArray {
  
    public static void main(String args[]) {
        Student array[] = new Student[2];
        for (int i = 0; i < array.length; i++) {
            Student stud = new Student();
            stud.setDetails();
            array[i] = stud;
        }

        for (int i = 0; i < array.length; i++) {
            Student stud = array[i];
            int tot = stud.getTotal();//Accessing
            System.out.println((i + 1) + " student total marks=" + tot);
        }

    }

}
