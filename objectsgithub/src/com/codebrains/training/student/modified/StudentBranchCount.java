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
public class StudentBranchCount {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Student array[] = new Student[3];
        for (int i = 0; i < array.length; i++) {
            Student stud = new Student();
            stud.setDetails();
            array[i] = stud;
        }
        
        System.out.println("\tStudent Details\n");
        System.out.println("Rollno\tName\tBranch");
        for (int i = 0; i < array.length; i++) {
           Student stud = array[i];
           System.out.println(stud.rno+"\t"+stud.name+"\t"+stud.branch);
        }
        
        System.out.println("\n");
        int count = 0;
        System.out.println("Enter a branch");
        String branch=scan.next();
        for (int i = 0; i < array.length; i++) {
            Student stud = array[i];
            if (stud.branch.equalsIgnoreCase(branch)) {
                count++;
            }
        }
        
        System.out.println(branch +" got nof students "+count);
    }
    
}
