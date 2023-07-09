package com.codebrains.training.employee.jdbc;

import com.codebrains.training.employee.*;
import com.codebrains.training.employee.dto.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeCrud {

    public static boolean isEmployeeExists(int empNo) {
        try {
            Connection con = getCon();
            PreparedStatement st = con.prepareStatement("select * from emp where empno=?");
            st.setInt(1, empNo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {  //moving from one row to next row
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Update Failed. Please check Accordingly");
        }
        return false;
    }

    public static Connection getCon() throws Exception {
        //step1 load the driver class  
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //step2 create  the connection object  
        Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "system", "divya");
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

                    } catch (ClassNotFoundException cnfe) {
                        //System.out.print("Please Check Oracle Running or Not ");
                        //cnfe.printStackTrace();
                        //java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver
                        //java.sql.SQLException: ORA-01017: invalid username/password; logon denied

                        System.out.print("Please Check Oracle Jar is there or not ");
                    } catch (SQLException se) {
                        //System.out.print("Please Check Oracle Running or Not ");
                        //java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver
                        //java.sql.SQLException: ORA-01017: invalid username/password; logon denied
                        //se.printStackTrace();

                        System.out.print("Please Check Oracle Credentials ");
                    } catch (Exception e) {
                        System.out.print("Please Check Some thing is wrong");
                    }
                    break;
                case 2:

                    try {
                        Connection con = getCon();
                        PreparedStatement st = con.prepareStatement("select * from emp");
                        ResultSet rs = st.executeQuery();
                        ResultSetMetaData rsmd = rs.getMetaData();
                        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                            System.out.print(rsmd.getColumnName(i) + "\t");
                        }
                        System.out.print("\n");
                        while (rs.next()) {  //moving from one row to next row
                            for (int i = 1; i <= rsmd.getColumnCount(); i++) {  //pickup each column in the current row
                                System.out.print(rs.getString(i) + "\t");
                            }
                            System.out.print("\n");

                        }

                    } catch (Exception e) {
                        System.out.print("Update Failed. Please check Accordingly");
                    }

                    break;
                case 3:
                    System.out.print("What is your Employee Number: ");
                    int empId = scan.nextInt();
                    try {
                        Connection con = getCon();
                        PreparedStatement st = con.prepareStatement("select * from emp where empno=?");
                        st.setInt(1, empId);
                        ResultSet rs = st.executeQuery();
                        if (rs.next()) {  //moving from one row to next row
                            ResultSetMetaData rsmd = rs.getMetaData();
                            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                                System.out.print(rsmd.getColumnName(i) + "\t");
                            }
                            System.out.print("\n");
                            for (int i = 1; i <= rsmd.getColumnCount(); i++) {  //pickup each column in the current row
                                System.out.print(rs.getString(i) + "\t");
                            }
                        } else {
                            System.out.println("There is no employee with this " + empId + " Number");
                        }

                    } catch (Exception e) {
                        System.out.print("Update Failed. Please check Accordingly");
                    }
                    break;
                case 4:
                    System.out.print("What is your Employee Number: ");
                    empId = scan.nextInt();
                    boolean isThere = isEmployeeExists(empId);
                    if (isThere == true) {
                        System.out.print("Enter salary for updation:  ");
                        int sal = scan.nextInt();
                        try {
                            Connection con = getCon();
                            PreparedStatement st = con.prepareStatement("update emp set sal=nvl(sal,0)+? where empno=?");
                            st.setInt(1, sal);
                            st.setInt(2, empId);
                            int c = st.executeUpdate();
                            System.out.println("Updated Successfully");

                        } catch (Exception e) {
                            System.out.print("Update Failed. Please check Accordingly");
                        }
                    } else {
                        System.out.println("There is no employee with this " + empId + " Number");
                    }
                    break;
                case 5:
                    System.out.print("What is your Employee Number: ");
                    empId = scan.nextInt();
                    try {
                        Connection con = getCon();
                        PreparedStatement st = con.prepareStatement("delete from emp where empno=?");
                        st.setInt(1, empId);
                        int c = st.executeUpdate();
                        System.out.println("Deleted Successfully");

                    } catch (Exception e) {
                        System.out.print("Delete Failed. Please check Accordingly");
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
