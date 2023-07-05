
package com.codebrains.training.student;

import com.codebrains.training.student.dto.Student;
import java.util.ArrayList;
import java.util.Scanner;


public class studentCrud {
     public static void main(String[] args) {
        ArrayList<Student> StudentList = new ArrayList<Student>(5);
        Scanner scan = new Scanner(System.in);
        char isContinue;
     do {
            System.out.println("\tMenu");
            System.out.println("1.Adding");
            System.out.println("2.Retrieval");
            System.out.println("3.Search");
            System.out.println("4.Update");
            System.out.println("5.Delete");
            System.out.print("Select The Opttion : ");
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    Student stud = new Student();
                    stud.setDetails();
                    StudentList.add(stud);
                    break;
                case 2:
                    System.out.println("StudRno\t\tStudName\t\tStudBranch\t StudM1\tStud1"
                            + "1"
                            + "M2");
                    for (Student student : StudentList) {  //for each
                        System.out.println(student.rno + "\t\t" + student.name + "\t\t\t" + student.branch + "\t\t" + student.m1 + "\t\t" +student.m2);
                    }
                    break;
                 case 3:
                    System.out.print("What is your Student RollNumber: ");
                    int rno = scan.nextInt();
                    int isThere = 0;
                    for (Student student : StudentList) {  //for each
                        if (student.rno == rno) {
                            System.out.println("StudRno\t\tStudName\t\tStudBranch\t\t StudM1\t\tStudM2");
                            System.out.println(student.rno + "\t\t" + student.name + "\t\t" + student.branch + "\t\t" + student.m1 + "\t\t" +student.m2);
                            isThere = 1;
                            break;
                        }
                    }
                    if (isThere == 0) {
                        System.out.println("There is no Student with that RollNumber: " + rno);
                    }
                    break;
                case 4:
                    System.out.print("What is your Student RollNumber: ");
                    rno = scan.nextInt();
                    System.out.print("Enter name for updation:  ");
                    String name = scan.next();
                    isThere = 0;
                    for (Student student : StudentList) { //for each
                        if (student.rno == rno) {
                            student.name = name;
                            System.out.println("Updated Succesfully");
                            isThere = 1;
                            break;
                        }
                    }
                    if (isThere == 0) {
                        System.out.println("There is no student with that rollno: " + rno);
                    }
                    break;
                case 5:
                    System.out.print("What is your Student Roll Number: ");
                    rno = scan.nextInt();
                    isThere = 0;
                    for (Student student : StudentList) {  //for each
                        if (student.rno == rno) {
                            StudentList.remove(student);
                            System.out.println("Deleted Successfully");
                            isThere = 1;
                            break;
                        }
                    }
                    if (isThere == 0) {
                        System.out.println("There is no Student with thid rollno: " + rno);
                    }
                    break;
                default:
                    System.out.println("There is no Option with this " + option + " chioice");
            }
            System.out.println("You Want to Continue(y/n)");
            isContinue = scan.next().charAt(0);
        } while (isContinue != 'n');
   
}
     }

     
