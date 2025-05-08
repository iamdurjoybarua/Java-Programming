# Employee Information System in Java

This repository contains a Java program that manages basic employee information, including name, salary, and hire date. The program calculates and displays the employee's years of service.

## Features

* **EmployeeInfo Class:**
    * Stores employee details such as name (String), salary (double), and hire date (`LocalDate`).
    * Uses the `java.time` package for handling date information, specifically `LocalDate` for the hire date.
    * Includes a constructor to initialize employee details upon object creation.
    * Provides a `calculateYearsOfService()` method that calculates the number of full years an employee has worked based on their hire date and the current date. It uses `java.time.Period` for accurate date difference calculation.
    * Offers a `displayInfo()` method to print the employee's name, salary, hire date, and calculated years of service to the console.

* **Main Method:**
    * The `main` method within the `EmployeeInfo` class demonstrates how to create an `EmployeeInfo` object.
    * It initializes an employee with a sample name, salary, and hire date.
    * It then calls the `displayInfo()` method to output the employee's details, including the calculated years of service.

## Getting Started

1.  **Prerequisites:** Ensure you have the Java Development Kit (JDK) installed on your system. This program utilizes features from Java 8 and later (`java.time` package).
2.  **Download:** You can download the `EmployeeInfo.java` file from this repository.
3.  **Compilation:** Open a terminal or command prompt, navigate to the directory where you saved `EmployeeInfo.java`, and compile the code using the Java compiler:
    ```bash
    javac EmployeeInfo.java
    ```
4.  **Execution:** After successful compilation, run the program using the Java Virtual Machine:
    ```bash
    java EmployeeInfo
    ```

## Usage

The `main` method in the `EmployeeInfo` class provides a basic example of how to use the class. When you run the program, it will:

* Create an `EmployeeInfo` object with the name "Durjoy Barua", a salary of $85000.0, and a hire date of June 1, 2012.
* Calculate the years of service based on the current date (May 9, 2025, according to the context).
* Display the employee's name, salary, hire date (in YYYY-MM-DD format), and the calculated years of service in the console.

You can modify the `main` method to create and display information for different employees with varying hire dates to see the `calculateYearsOfService()` method in action.

## Potential Enhancements

* Add methods to update employee information (e.g., salary, name).
* Implement functionality to store and manage a collection of employees.
* Incorporate error handling for invalid date formats or other input.
* Extend the program to calculate other time-related information, such as the number of months or days of service.
* Integrate with data storage mechanisms (e.g., files, databases) to persist employee data.

## Author

Durjoy Barua / https://github.com/iamdurjoybarua
