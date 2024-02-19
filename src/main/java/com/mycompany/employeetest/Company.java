package com.mycompany.employeetest;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author peta
 */
public class Company {
    
    // Declares Company class with the following fields
    String companyName;
    ArrayList<Employee> staff = new ArrayList<Employee>();

    // Default constructor for class Company that initialises all fields
    public Company(String companyName, ArrayList<Employee> staff) {
        this.companyName = companyName;
        this.staff = staff;
    }
    
    // Overloaded constructor which accepts a name value as a parameter
    public Company(String name) {
        this.companyName = companyName;
        this.staff = staff;
    }
    
    // addNewStaff() adds a new employee to the staff arrayList with the employee as a parameter
    public void addNewStaff(Employee newEmp) {
        staff.add(newEmp);
    }
    
    // getStaffNumber() returns the number of employees currently in the staff arrayList
    public int getStaffNumber() {
        int staffSize = staff.size();
        return staffSize;
    }
    
    // listEmployees() uses an iterator object to find in the arrayList all employees above a given employee
    // number value (this value is a parameter for this method) and prints the names of these employees.
    public void listEmployees(int chosenEmpNumber) {
        for (Employee emp : staff) {
            if (emp.empNum > chosenEmpNumber ) {
                System.out.println(emp.name);
            }
        }
    }
}


