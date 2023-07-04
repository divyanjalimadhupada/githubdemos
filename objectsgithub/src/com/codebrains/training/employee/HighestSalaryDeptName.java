/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebrains.training.employee;


import com.codebrains.training.employee.dto.Department;
import com.codebrains.training.employee.dto.Employee;
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

        ArrayList<Department> deptList = new ArrayList<Department>(5);
        Department dept1 = new Department(11, "CodeBrains", "Vizag");
        deptList.add(dept1);
        Department dept2 = new Department(13, "CB", "HYd");
        deptList.add(dept2);
        Department dept3 = new Department(11, "CodeBrains", "Vizag");
        deptList.add(dept3);
        Department dept4 = new Department(12, "Coding", "vzm");
        deptList.add(dept4);
        Department dept5 = new Department(13, "CB", "Hyd");
        deptList.add(dept5);
        int departmentNo = 0;
        long highSalary = 0;
        for (Employee emp : employeeList) {  //for each
            if (emp.sal > highSalary) {
                highSalary = emp.sal;
                departmentNo = emp.depNum;
            }
        }
        System.out.println("Highest Salary is " + highSalary + " and Department Number is " + departmentNo);
        for (Department dept : deptList) {
            if (departmentNo == dept.depNum) {
                System.out.println(" Department Name is " + dept.depName + " and Department Location is " + dept.depLoc);
            }

        }
    }
}

