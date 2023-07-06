package com.codebrains.training.employee.jdbc;

import com.codebrains.training.employee.*;
import com.codebrains.training.employee.dto.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeCrud {

    public static Connection getCon() throws Exception {
        //step1 load the driver class  
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //step2 create  the connection object  
        Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@ślocalhost:1521:xe", "system", "divya");
        return con;
    }

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
            int option = 0;
            try {
                option = scan.nextInt();
            } catch (InputMismatchException ime) {
                System.out.print("Please Check Your Options ");
            }
            switch (option) {
                case 1:
                    try {
                        Connection con = getCon();
                        PreparedStatement st = con.prepareStatement("insert into emp(empno,ename) values(?,?)");
                        System.out.println("Enter empno");
                        int empNo = scan.nextInt();
                        System.out.println("Enter Empname");
                        String empName = scan.next();

                        st.setInt(1, empNo);
                        st.setString(2, empName);
                        int c = st.executeUpdate();
                        System.out.println("Added Successfully");

                    } catch (ClassNotFoundException ime) {
                        //System.out.print("Please Check Oracle Running or Not ");
                        //java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver
                        //java.sql.SQLException: ORA-01017: invalid username/password; logon denied
                        //ime.printStackTrace();
                        
                        System.out.print("Please Check Oracle Jar is there or not ");
                    }catch (SQLException ime) {
                        //System.out.print("Please Check Oracle Running or Not ");
                        //java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver
                        //java.sql.SQLException: ORA-01017: invalid username/password; logon denied
                        //ime.printStackTrace();
                        
                        System.out.print("Please Check Oracle Credentials ");
                    }catch (Exception ime) {
                        //System.out.print("Please Check Oracle Running or Not ");
                        //java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver
                        //java.sql.SQLException: ORA-01017: invalid username/password; logon denied
                        //ime.printStackTrace();
                        
                        System.out.print("Please Check Some thing is wrong");
                    }
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
