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

        // Declaring all necessary variables to be able to use them inside of other scopes
        String correctUsername = Manager.username;
        String correctPassword = Manager.password;
        String inputUsername;
        String inputPassword;
        int selectedOperation;
        int selectedEmployee;

        // Asking input from the manager
        Scanner userInput = new Scanner(System.in);

        // Conditional statements for the manager to login
        for (int attemptsRemaining = 2; attemptsRemaining >= 0; attemptsRemaining--) {
            System.out.println("Please enter your username: ");
            inputUsername = userInput.nextLine();
            System.out.println("Please enter your password: ");
            inputPassword = userInput.nextLine();
            // Manager will have three attempts to login with the right credentials
            if (((!correctUsername.equals(inputUsername)) || (!correctPassword.equals(inputPassword))) && (attemptsRemaining > 0)) {
                System.out.println("Incorrect. You have " + attemptsRemaining + " attempts remaining.");
                // If the manager fails to login, program will stop and the access will be denied
            } else if (((!correctUsername.equals(inputUsername)) || (!correctPassword.equals(inputPassword))) && (attemptsRemaining == 0)) {
                System.out.println("Access denied. You are now locked out of the system.");
                // If the manager logins with the right credentials, then the program will continue
                // and will ask the manager to choose to display the current staff, to enter new staff or to remove current staff
            } else if ((correctUsername.equals(inputUsername)) && (correctPassword.equals(inputPassword)) && (attemptsRemaining >= 0)) {
                try {
                    do {
                        System.out.println("Please enter an option.");
                        System.out.println("1 - To display current staff.");
                        System.out.println("2 - To add new staff.");
                        System.out.println("3 - To remove staff.");
                        System.out.println("4 - To Exit");
                        selectedOperation = Integer.parseInt(userInput.nextLine());
                        attemptsRemaining = 0;
                        // Parsing the selected operation to string, to be able to check regex condition later on
                        String selectedOperationToString = Integer.toString(selectedOperation);
                        // Option 1 to display current staff
                        if (selectedOperation == 1) {
                            Company.displayEmployees();
                            // Option 2 to add new staff
                        } else if (selectedOperation == 2) {
                            System.out.println("Please enter the new employee Name:");
                            String newEmployeeName = userInput.nextLine();
                            System.out.println("Please enter the new employee Email address:");
                            String newEmployeeEmail = userInput.nextLine();
                            Company.addNewStaff(new Employee(newEmployeeName, newEmployeeEmail));
                            // Option 3 to remove staff
                        } else if (selectedOperation == 3) {
                            System.out.println("Please enter the number of the employee you would like to remove:");
                            selectedEmployee = Integer.parseInt(userInput.nextLine());
                            Company.removeStaff(selectedEmployee);
                            // Option 4 to exit the program
                        } else if (selectedOperation == 4) {
                            System.out.println("You have now exit the program.");
                            // If the manager doesn't enter the right character, the program will print a helpful message
                        } else if ((!selectedOperationToString.matches("^[0-9]\\d*$")) || (selectedOperation < 1) || (selectedOperation > 3)) {
                            System.out.println("You have not entered the right character, please start again.");
                        }
                    } while (selectedOperation != 4);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
