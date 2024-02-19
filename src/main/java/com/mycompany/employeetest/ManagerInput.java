/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeetest;

import java.util.Scanner;

/**
 *
 * @author peta
 */
public class ManagerInput {
    
    public void managerLogin() {
    
        // Declaring variables for username, password and counter for the login attempts
        String correctUsername = "Gnomeo"; //TO AMEND TO EMPLOYEE METHOD
        String correctPassword = "smurf"; //TO AMEND TO EMPLOYEE METHOD
        //int attemptsRemaining = 3;
        String inputUsername;
        String inputPassword;
        String selectedOperation;
        
        // Asking input from the manager
        Scanner userInput = new Scanner(System.in);
        
        // Conditional statements for the manager to login
        for (int attemptsRemaining = 2; attemptsRemaining >= 0; attemptsRemaining--) {
            System.out.println("Please enter username: ");
            inputUsername = userInput.nextLine();
            System.out.println("Please enter password: ");
            inputPassword = userInput.nextLine();
            if ((!correctUsername.equals(inputUsername)) && (!correctPassword.equals(inputPassword)) && (attemptsRemaining > 0)) {
                System.out.println("Incorrect. You have " + attemptsRemaining + " attempts remaining.");
            } else if ((!correctUsername.equals(inputUsername)) && (!correctPassword.equals(inputPassword)) && (attemptsRemaining == 0)) {
                System.out.println("Access denied. You are now locked out of the system.");
            } else if ((correctUsername.equals(inputUsername)) && (correctPassword.equals(inputPassword)) && (attemptsRemaining > 0)) {
                System.out.println("Access granted. To display current staff enter 'C'. To add new staff enter 'N': ");
                selectedOperation = userInput.nextLine();
                attemptsRemaining = 0;
            }
        }
        
    }
}