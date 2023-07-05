package com.codebrains.training.student;

import com.codebrains.training.student.dto.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class studentCrud {

    public static Student getStudent(ArrayList<Student> StudentList, int rno) {
        for (Student student : StudentList) {  //for each
            if (student.rno == rno) {
                return student;
            }
        }
        return null;
    }

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
                    System.out.println("StudRno\t\tStudName\tStudBranch\t StudM1\t\tStudM2");
                    for (Student student : StudentList) {  //for each
                        System.out.println(student.rno + "\t\t" + student.name + "\t\t" + student.branch + "\t\t" + student.m1 + "\t\t" + student.m2);
                    }
                    break;
                case 3:
                    System.out.print("What is your Student RollNumber: ");
                    int rno = scan.nextInt();
                    Student studentObject = getStudent(StudentList, rno);
                    if (studentObject != null) {
                        System.out.println("StudRno\t\tStudName\t\tStudBranch\t\t StudM1\t\tStudM2");
                        System.out.println(studentObject.rno + "\t\t" + studentObject.name + "\t\t" + studentObject.branch + "\t\t" + studentObject.m1 + "\t\t" + studentObject.m2);
                    } else {
                        System.out.println("There is no Student with that RollNumber: " + rno);
                    }

                    break;
                case 4:
                    System.out.print("What is your Student RollNumber: ");
                    rno = scan.nextInt();
                    System.out.println("\t what do you want to update");
                    System.out.println("a.name");
                    System.out.println("b.branch");
                    System.out.println("c.m1");
                    System.out.println("d.m2");
                    System.out.print("Select The Opttion : ");
                    char option2 = scan.next().charAt(0);
                    switch (option2) {
                        case 'a':
                            System.out.print("Enter name for updation:  ");
                            String name = scan.next();
                            int isThere = 0;
                            for (Student student : StudentList) { //for each
                                if (student.rno == rno) {
                                    student.name = name;
                                    System.out.println("name Updated Succesfully");
                                    isThere = 1;
                                    break;
                                }
                            }
                            if (isThere == 0) {
                                System.out.println("There is no student with that rollno: " + rno);
                            }
                            break;
                        case 'b':
                            System.out.print("Enter branch for updation:  ");
                            String branch = scan.next();
                            isThere = 0;
                            for (Student student : StudentList) { //for each
                                if (student.rno == rno) {
                                    student.branch = branch;
                                    System.out.println("branch Updated Succesfully");
                                    isThere = 1;
                                    break;
                                }
                            }
                            if (isThere == 0) {
                                System.out.println("There is no student with that rollno: " + rno);
                            }
                            break;
                        case 'c':
                            System.out.print("Enter m1 marks for updation:  ");
                            int m1 = scan.nextInt();
                            isThere = 0;
                            for (Student student : StudentList) { //for each
                                if (student.rno == rno) {
                                    student.m1 = m1;
                                    System.out.println("m1 marks Updated Succesfully");
                                    isThere = 1;
                                    break;
                                }
                            }
                            if (isThere == 0) {
                                System.out.println("There is no student with that rollno: " + rno);
                            }
                            break;

                        case 'd':
                            System.out.print("Enter m2 marks for updation:  ");
                            int m2 = scan.nextInt();
                            isThere = 0;
                            for (Student student : StudentList) { //for each
                                if (student.rno == rno) {
                                    student.m2 = m2;
                                    System.out.println("m2 marks Updated Succesfully");
                                    isThere = 1;
                                    break;
                                }
                            }
                            if (isThere == 0) {
                                System.out.println("There is no student with that rollno: " + rno);
                            }
                    }
                    break;

                case 5:
                    System.out.print("What is your Student Roll Number: ");
                    rno = scan.nextInt();
                    int isThere = 0;
                    for (Student student : StudentList) {  //for each
                        if (student.rno == rno) {
                            StudentList.remove(student);
                            System.out.println("Deleted Successfully");
                            isThere = 1;
                            break;
                        }
                    }
                    if (isThere == 0) {
                        System.out.println("There is no Student with this rollno: " + rno);
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
