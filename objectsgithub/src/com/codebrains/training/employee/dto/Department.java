/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codebrains.training.employee.dto;

/**
 *
 * @author hp
 */
public class Department {
   public int depNum;
   public String depName;
   public String depLoc;
    
    

public Department(){
}

public Department(int departmentNumber,String departmentName,String departmentLocation){
    depNum=departmentNumber;
    depName=departmentName;
    depLoc=departmentLocation;
}
}
