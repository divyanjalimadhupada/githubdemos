/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebrains.training.student.modified;

import com.codebrains.training.student.dto.Student;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class StudHighestMarks {

   
    public static void main(String args[]) {
        Student array[] = new Student[2];
        for (int i = 0; i < array.length; i++) {
            Student stud = new Student();
            stud.setDetails();
            array[i] = stud;
        }
        int big = 0;
        Student highStudent=null;
        for (int i = 0; i < array.length; i++) {
            Student stud = array[i];
            int tot = stud.getTotal();//Accessing
            if (tot > big) {
                big=tot;
                highStudent=stud;
            }
        }
        
        System.out.println(highStudent.name +" got highest marks "+highStudent.getTotal());
    }

}
