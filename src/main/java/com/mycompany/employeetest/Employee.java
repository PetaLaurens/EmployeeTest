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
    
    // Static field: nextEmpNum, of type int and initialised to 1, ??????which initialises empNum in the constructor???????
    static int nextEmpNum = 1;
}
