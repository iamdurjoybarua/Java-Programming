# Employee Management System in Java

This repository contains a simple Java program for managing employee information. The program defines an `Employee` class with attributes for name, job title, and salary. It includes methods to calculate annual salary, update salary, and display employee information.

## Features

* **Employee Class:** Represents an employee with attributes for name, job title, and salary.
* **Constructor:** Initializes employee details when an `Employee` object is created.
* **Getter Methods:** Provides access to the employee's name, job title, and salary.
* **`calculateAnnualSalary()`:** Calculates and returns the annual salary of the employee.
* **`updateSalary()`:** Updates the employee's salary, with validation to ensure the new salary is not negative.
* **`displayEmployeeInfo()`:** Prints the employee's name, job title, salary, and annual salary to the console.
* **`main()` Method:** Demonstrates the creation of an `Employee` object, displaying initial information, calculating annual salary, updating the salary (including a test with an invalid negative value), displaying updated information, and using the getter methods.

## Getting Started

1.  **Prerequisites:** You need to have Java Development Kit (JDK) installed on your system.
2.  **Download:** You can download the `Employee.java` file from this repository.
3.  **Compilation:** Open a terminal or command prompt, navigate to the directory where you saved `Employee.java`, and compile the code using the Java compiler:
    ```bash
    javac Employee.java
    ```
4.  **Execution:** After successful compilation, run the program using the Java Virtual Machine:
    ```bash
    java Employee
    ```

## Usage

The `main` method in the `Employee` class demonstrates how to use the `Employee` class:

* An `Employee` object named `employee1` is created with initial details.
* The initial employee information is displayed.
* The annual salary is calculated and printed.
* The employee's salary is updated to a new value.
* An attempt is made to update the salary with a negative value to demonstrate the validation.
* The updated employee information is displayed.
* The getter methods (`getName()`, `getJobTitle()`, `getSalary()`) are used to retrieve and print individual employee attributes.

You can create more `Employee` objects and interact with them in a similar way to manage a collection of employee data. This basic structure can be extended to include more functionalities, such as storing employee data in files or databases, adding methods for promotions or changing job titles, and implementing more sophisticated employee management features.

## Potential Enhancements

* Implement error handling for invalid input during employee creation.
* Add functionality to store and retrieve multiple employee records (e.g., using an `ArrayList`).
* Include methods for raising or lowering salaries by a percentage.
* Implement a user interface (either command-line or graphical) for easier interaction.
* Persist employee data to a file or database.

## Author

Durjoy Barua / https://github.com/iamdurjoybarua
