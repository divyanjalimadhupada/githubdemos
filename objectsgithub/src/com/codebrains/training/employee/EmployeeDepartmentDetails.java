/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebrains.training.employee;

import com.codebrains.training.EmployeeAndDepartments.dto.EmployeeDetails;
import com.codebrains.training.EmployeeAndDepartments.dto.DepartmentDetails;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class EmployeeDepartmentDetails {

    public static void main(String[] args) {
        ArrayList<EmployeeDetails> EmployeeDetailsList = new ArrayList<EmployeeDetails>(5);

        EmployeeDetails employee1 = new EmployeeDetails(11, "Divya", 30000, 01);
        EmployeeDetailsList.add(employee1);
        EmployeeDetails employee2 = new EmployeeDetails(12, "Navya", 60000, 02);
        EmployeeDetailsList.add(employee2);
        EmployeeDetails employee3 = new EmployeeDetails(13, "Veni", 20000, 01);
        EmployeeDetailsList.add(employee3);
        EmployeeDetails employee4 = new EmployeeDetails(14, "Sowmya", 50000, 03);
        EmployeeDetailsList.add(employee4);
        EmployeeDetails employee5 = new EmployeeDetails(15, "ashika", 50000, 04);
        EmployeeDetailsList.add(employee5);

        ArrayList<DepartmentDetails> departmentList = new ArrayList<DepartmentDetails>(5);
        DepartmentDetails dept1 = new DepartmentDetails(01, "CodeBrains", "Vizag");
        departmentList.add(dept1);
        DepartmentDetails dept2 = new DepartmentDetails(03, "anjaliWaterProof", "HYd");
        departmentList.add(dept2);
        DepartmentDetails dept3 = new DepartmentDetails(01, "CodeBrains", "Vizag");
        departmentList.add(dept3);
        DepartmentDetails dept4 = new DepartmentDetails(04, "DSN", "vjw");
        departmentList.add(dept4);
        DepartmentDetails dept5 = new DepartmentDetails(02, "CB", "Hyd");
        departmentList.add(dept5);

        int bigNum = 0;
        int deptNum = 0;
       
        for (EmployeeDetails emp : EmployeeDetailsList) {  //for each
            if (emp.empSalary > bigNum) {
                bigNum = emp.empSalary;
                deptNum = emp.depNum;
                
            }        }
        System.out.println("highest salary is " + bigNum + " and department number is  "+ deptNum);
        for (DepartmentDetails dept : departmentList) {
            if (deptNum == dept.depNum) {
                String departmentName = dept.depName;
                String departmentLocation = dept.depLoc;
                System.out.println("department name:" + departmentName + " location:" + departmentLocation);
            }

        }

    }

}
