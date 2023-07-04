/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebrains.training.employee;

import com.codebrains.training.employee.dto.Employee;
import com.codebrains.training.employee.dto.Department;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class EmployeeDepartmentDetails {

    public static void main(String[] args) {
        ArrayList<Employee> EmployeeDetailsList = new ArrayList<Employee>(5);

        Employee employee1 = new Employee(11, "Divya", 30000, 01);
        EmployeeDetailsList.add(employee1);
        Employee employee2 = new Employee(12, "Navya", 60000, 02);
        EmployeeDetailsList.add(employee2);
        Employee employee3 = new Employee(13, "Veni", 20000, 01);
        EmployeeDetailsList.add(employee3);
        Employee employee4 = new Employee(14, "Sowmya", 50000, 03);
        EmployeeDetailsList.add(employee4);
        Employee employee5 = new Employee(15, "ashika", 50000, 04);
        EmployeeDetailsList.add(employee5);

        ArrayList<Department> departmentList = new ArrayList<Department>(5);
        Department dept1 = new Department(01, "CodeBrains", "Vizag");
        departmentList.add(dept1);
        Department dept2 = new Department(03, "anjaliWaterProof", "HYd");
        departmentList.add(dept2);
        Department dept3 = new Department(01, "CodeBrains", "Vizag");
        departmentList.add(dept3);
        Department dept4 = new Department(04, "DSN", "vjw");
        departmentList.add(dept4);
        Department dept5 = new Department(02, "CB", "Hyd");
        departmentList.add(dept5);

        int bigNum = 0;
        int deptNum = 0;
       
        for (Employee emp : EmployeeDetailsList) {  //for each
            if (emp.sal > bigNum) {
                bigNum = emp.sal;
                deptNum = emp.depNum;
                
            }        }
        System.out.println("highest salary is " + bigNum + " and department number is  "+ deptNum);
        for (Department dept : departmentList) {
            if (deptNum == dept.depNum) {
                String departmentName = dept.depName;
                String departmentLocation = dept.depLoc;
                System.out.println("department name:" + departmentName + " location:" + departmentLocation);
            }

        }

    }

}
