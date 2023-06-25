/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebrains.training.employee.dto;

import com.codebrains.training.employee.Employee;
import com.codebrains.training.employee.DeptDetails;

import java.util.ArrayList;

public class HighestSalaryDeptName {

    public static void main(String[] args) {

        ArrayList<Employee> employeeList = new ArrayList<Employee>(5);
        Employee emp1 = new Employee(1, "Avya", 4000, 11);
        employeeList.add(emp1);
        Employee emp2 = new Employee(2, "Divya", 8000, 13);
        employeeList.add(emp2);
        Employee emp3 = new Employee(3, "KrishnaVeni", 5000, 11);
        employeeList.add(emp3);
        Employee emp4 = new Employee(4, "Krish", 9000, 12);
        employeeList.add(emp4);
        Employee emp5 = new Employee(5, "Veni", 6000, 13);
        employeeList.add(emp5);

        ArrayList<DeptDetails> deptList = new ArrayList<DeptDetails>(5);
        DeptDetails dept1 = new DeptDetails(11, "CodeBrains", "Vizag");
        deptList.add(dept1);
        DeptDetails dept2 = new DeptDetails(13, "CB", "HYd");
        deptList.add(dept2);
        DeptDetails dept3 = new DeptDetails(11, "CodeBrains", "Vizag");
        deptList.add(dept3);
        DeptDetails dept4 = new DeptDetails(12, "Coding", "vzm");
        deptList.add(dept4);
        DeptDetails dept5 = new DeptDetails(13, "CB", "Hyd");
        deptList.add(dept5);
        int departmentNo = 0;
        long highSalary = 0;
        for (Employee emp : employeeList) {  //for each
            if (emp.salary > highSalary) {
                highSalary = emp.salary;
                departmentNo = emp.dNo;
            }
        }
        System.out.println("Highest Salary is " + highSalary + " and Department Number is " + departmentNo);
        for (DeptDetails dept : deptList) {
            if (departmentNo == dept.dNo) {
                System.out.println(" Department Name is " + dept.dName + " and Department Location is " + dept.dLoc);
            }

        }
    }
}

