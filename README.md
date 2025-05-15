# Collection of Simple Java Programs

This repository contains a series of basic Java programs demonstrating fundamental object-oriented programming concepts. Each program focuses on a specific real-world entity and its associated attributes and behaviors.

## Programs Included

This repository includes the following Java programs:

1.  **Employee Management (Single Employee):**
    * Defines an `Employee` class with attributes for name, job title, and salary.
    * Includes methods to calculate an annual salary and update the employee's salary.
    * Demonstrates basic object creation and method invocation.
    * *(See `Employee.java` and its README for more details)*

2.  **Simple Bank System:**
    * Defines an `Account` class to represent a bank account with an account number, customer name, and balance. It includes methods for deposit and withdrawal.
    * Defines a `Bank` class to manage a collection of `Account` objects. It provides methods to add and remove accounts, and to perform deposits and withdrawals on specific accounts.
    * The `BankSystem` class demonstrates the interaction between `Bank` and `Account` objects.
    * *(See `Account.java`, `Bank.java`, `BankSystem.java`, and their respective READMEs for more details)*

3.  **Traffic Light Simulation:**
    * Defines a `TrafficLight` class with attributes for the current color and the duration of that color.
    * Includes methods to change the traffic light's color and check if the current color is red or green.
    * A `main` method demonstrates basic traffic light state changes.
    * *(See `TrafficLight.java` and its README for more details)*

4.  **Employee Information with Service Calculation:**
    * Defines an `EmployeeInfo` class with attributes for name, salary, and hire date (`LocalDate`).
    * Includes a method to calculate the employee's years of service based on the hire date and the current date using the `java.time` package.
    * A `main` method shows how to create an `EmployeeInfo` object and display its information, including years of service.
    * *(See `EmployeeInfo.java` and its README for more details)*

5.  **Student Course Management:**
    * Defines a `Student` class with attributes for name, grade, and a list of enrolled courses.
    * Provides methods to add a course to the student's list and remove a course from the list, with checks for duplicates and existence.
    * A `main` method demonstrates how to create a `Student` object, enroll in courses, unenroll from a course, and display the student's information.
    * *(See `Student.java` and its README for more details)*

6.  **Library Management:**
    * Defines a `Library` class with a collection of `Book` objects (assuming a `Book` class with title and author attributes).
    * Includes methods to add a book to the library and remove a book by its title.
    * *(See `Library.java` and its README for more details)*

7.  **Airplane Flight Information:**
    * Defines an `Airplane` class with attributes for flight number, destination, and departure time.
    * Includes methods to check flight status and delay.
    * *(See `Airplane.java` and its README for more details)*

8.  **Inventory Management:**
    * Defines an `Inventory` class with a collection of `Product` objects.
    * Includes methods to add and remove products, and to check for low inventory.
    * *(See `Inventory.java` and its README for more details)*

9.  **School Management:**
    * Defines a `School` class with attributes for students, teachers, and classes.
    * Includes methods to add and remove students and teachers, and to create classes.
    * *(See `School.java` and its README for more details)*

10. **Music Library:**
    * Defines a `MusicLibrary` class with a collection of songs.
    * Includes methods to add and remove songs, and to play a random song.
    * *(See `MusicLibrary.java` and its README for more details)*

## Getting Started

For each program:

1.  **Prerequisites:** Ensure you have the Java Development Kit (JDK) installed on your system.
2.  **Download:** Download the specific `.java` file(s) for the program you want to run from this repository.
3.  **Compilation:** Open a terminal or command prompt, navigate to the directory where you saved the `.java` file(s), and compile the code using the Java compiler:
    ```bash
    javac <FileName>.java
    ```
    *(Replace `<FileName>.java` with the actual name of the Java file(s))*
4.  **Execution:** After successful compilation, run the program using the Java Virtual Machine:
    ```bash
    java <MainClassName>
    ```
    *(Replace `<MainClassName>` with the name of the class containing the `main` method (usually the same as the filename without the `.java` extension))*

    * For the Bank System, run `java BankSystem`.
    * For the other single-class programs, run `java Employee`, `java TrafficLight`, `java EmployeeInfo`, `java Student`, `java Library`, `java Airplane`, `java Inventory`, `java School`, or `java MusicLibrary`.

## Usage

Each program's `main` method provides a basic demonstration of its functionality. You can modify these `main` methods or create new classes to further explore and extend the capabilities of each program. Refer to the individual README files (if present) for more specific usage instructions and potential enhancements for each program.

## Potential Enhancements

The "Potential Enhancements" section in each program's individual README file outlines possible ways to extend the functionality and complexity of that specific program. Common enhancements across these programs could include:

* Implementing more robust error handling and input validation.
* Creating user interfaces (command-line or GUI) for easier interaction.
* Persisting data to files or databases.
* Adding more attributes and behaviors relevant to each entity.
* Exploring more advanced Java concepts and libraries.

## Author

Durjoy Barua / https://github.com/iamdurjoybarua
