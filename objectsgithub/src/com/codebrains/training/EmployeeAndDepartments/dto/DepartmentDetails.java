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
public class DepartmentDetails {
   public int depNum;
   public String depName;
   public String depLoc;
    
    

public DepartmentDetails(){
}

public DepartmentDetails(int departmentNumber,String departmentName,String departmentLocation){
    depNum=departmentNumber;
    depName=departmentName;
    depLoc=departmentLocation;
}
}
