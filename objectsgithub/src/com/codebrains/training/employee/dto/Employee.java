/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codebrains.training.employee.dto;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Employee {
    public int empId;
    public String empName;
    public int sal;
    public int depNum;

 public  Employee() {
    
 }   
 public Employee(int employeeId, String employeeName, int employeeSalary,int employeeDepartmentNumber) {
        empId = employeeId;
        empName = employeeName;
        sal = employeeSalary;
        depNum = employeeDepartmentNumber;
        
    }
 
  public void setDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Emp Number");
        empId = scan.nextInt();
        System.out.println("Enter Emp Name");
        empName = scan.next();
        System.out.println("Enter Emp Salary");
        sal = scan.nextInt();
        System.out.println("Enter Dept Number");
        depNum = scan.nextInt();
        
    }
}

