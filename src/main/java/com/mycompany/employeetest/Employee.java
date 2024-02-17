/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeetest;

/**
 *
 * @author peta
 */
public class Employee {
    
    // Declares Employee class with the following fields and methods
    String name;
    String email;
    int empNum;
    
    // One constructor initialises the name and email instance fields with default values
    
    // The other constructor initialises these fields with values passed as parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    // Accessor methods to return name, email and empNum values
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getEmpNum() {
        return empNum;
    }
    
    // To set the email field to a new value passed as a parameter.  ///////////The value must not be accepted if its length is 3 or less.
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Static field: nextEmpNum, of type int and initialised to 1, ??????which initialises empNum in the constructor???????
    static int nextEmpNum = 1;
    
    // To return the current value of nextEmpNum.
    public static int getNextEmpNum() {
        return nextEmpNum;
    }
}
