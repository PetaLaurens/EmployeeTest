/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.employeetest;

/**
 *
 * @author peta
 */
public class EmployeeTest {

    public static void main(String[] args) {
        
        // Creates 3 Employee objects
        Employee emp1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee emp2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee emp3 = new Employee("Tom Thumb", "tt@gmail.com");
        
        // Declares an array, called projectGroup, to store the above Employee objects 
        Employee[] projectGroup = {emp1, emp2, emp3};
        
        // Prints out the value of variable nextEmpNum to the terminal window
        System.out.println(Employee.nextEmpNum);
        
        // Code to search and display the name of each of the employees in the projectGroup
        // array, who have an employee number above the value stored in a variable called m.
        int m = 0;
        
        for (Employee emp : projectGroup) {
            if (emp.empNum > m ) {
                System.out.println(emp.name);
            }
        }
        
        // Running program for the manager to login
        ManagerInput input = new ManagerInput();
            input.managerLogin();
    }
}

