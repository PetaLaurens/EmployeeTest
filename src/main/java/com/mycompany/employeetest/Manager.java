/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeetest;

/**
 *
 * @author peta
 */
public class Manager extends Employee {

    // Declaring fields for username and password to a fixed value
    static String username = "Gnomeo";
    static String password = "smurf";

    // Constructor extends from class Employee
    public Manager(String name, String email) {
        super(name, email);
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
