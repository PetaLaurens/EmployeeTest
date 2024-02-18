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
    public Employee() {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }
    
    // The other constructor initialises these fields with values passed as parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }
    
    // Accessor methods to return name, email and empNum values
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }
    
    public String getEmail() {
        return email;
    }
    
    // To set the email field to a new value passed as a parameter.  ///////////The value must not be accepted if its length is 3 or less.
    public void setEmail(String email) {
        this.email = email;
    }
   
    // Static field: nextEmpNum, of type int and initialised to 1, which initialises empNum in the constructor?
    public static int nextEmpNum = 1;
    
    // To return the current value of nextEmpNum.
    public int getNextEmpNum() {
        return nextEmpNum;
    }

}
