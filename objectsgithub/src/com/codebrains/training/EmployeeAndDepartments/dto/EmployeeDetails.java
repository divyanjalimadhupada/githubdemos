/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codebrains.training.EmployeeAndDepartments.dto;

/**
 *
 * @author hp
 */
public class EmployeeDetails {
    public int empId;
    public String empName;
    public int empSalary;
    public int depNum;

 public  EmployeeDetails() {
    
 }   
 public EmployeeDetails(int employeeId, String employeeName, int employeeSalary,int employeeDepartmentNumber) {
        empId = employeeId;
        empName = employeeName;
        empSalary = employeeSalary;
        depNum = employeeDepartmentNumber;
        
    }
}

