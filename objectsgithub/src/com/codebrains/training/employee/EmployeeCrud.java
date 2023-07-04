/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebrains.training.employee;

import com.codebrains.training.employee.dto.Employee;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class EmployeeCrud {

    public static void main(String[] args) {
        ArrayList<Employee> EmployeeList = new ArrayList<Employee>(5);
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
                    Employee emp = new Employee();
                    emp.setDetails();
                    EmployeeList.add(emp);
                    break;
                case 2:
                    System.out.println("EmpID\tEmpName\tSalary\tdepNum");
                    for (Employee employee : EmployeeList) {  //for each
                        System.out.println(employee.empId + "\t" + employee.empName + "\t" + employee.sal + "\t" + employee.depNum);
                    }
                    break;
                case 3:
                    System.out.print("What is your Employee Number: ");
                    int empId = scan.nextInt();
                    int isThere = 0;
                    for (Employee employee : EmployeeList) {  //for each
                        if (employee.empId == empId) {
                            System.out.println("EmpID\tEmpName\tSalary\tdepNum");
                            System.out.println(employee.empId + "\t" + employee.empName + "\t" + employee.sal + "\t" + employee.depNum);
                            isThere = 1;
                            break;
                        }
                    }
                    if (isThere == 0) {
                        System.out.println("There is no Employee with thid ID: " + empId);
                    }
                    break;
                case 4:
                    System.out.print("What is your Employee Number: ");
                    empId = scan.nextInt();
                    System.out.print("Enter salary for updation:  ");
                    int sal = scan.nextInt();
                    isThere = 0;
                    for (Employee employee : EmployeeList) {  //for each
                        if (employee.empId == empId) {
                            employee.sal = sal;
                            System.out.println("Updated Succesfully");
                            isThere = 1;
                            break;
                        }
                    }
                    if (isThere == 0) {
                        System.out.println("There is no Employee with thid ID: " + empId);
                    }
                    break;
                case 5:
                    System.out.print("What is your Employee Number: ");
                    empId = scan.nextInt();
                    isThere = 0;
                    for (Employee employee : EmployeeList) {  //for each
                        if (employee.empId == empId) {
                            EmployeeList.remove(employee);
                            System.out.println("Deleted Successfully");
                            isThere = 1;
                            break;
                        }
                    }
                    if (isThere == 0) {
                        System.out.println("There is no Employee with thid ID: " + empId);
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
