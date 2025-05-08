// Define a class named "Employee"
public class Employee {

    // Attributes (instance variables) to store employee information
    private String name;       // Employee's name
    private String jobTitle;    // Employee's job title
    private double salary;     // Employee's salary

    /**
     * Constructor for the Employee class.
     * Initializes the name, jobTitle, and salary of an employee.
     *
     * @param name      The name of the employee.
     * @param jobTitle  The job title of the employee.
     * @param salary    The salary of the employee.
     */
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter method to retrieve the employee's name
    public String getName() {
        return name;
    }

    // Getter method to retrieve the employee's job title
    public String getJobTitle() {
        return jobTitle;
    }

    // Getter method to retrieve the employee's salary
    public double getSalary() {
        return salary;
    }

    /**
     * Method to calculate the annual salary of the employee.
     *
     * @return The annual salary (salary multiplied by 12).
     */
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    /**
     * Method to update the employee's salary.
     *
     * @param newSalary The new salary to set for the employee.
     * It should be a non-negative value.
     */
    public void updateSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
            System.out.println("Salary updated successfully for " + name + ". New salary: " + salary);
        } else {
            System.out.println("Invalid salary value. Salary cannot be negative.  " + name + "'s salary remains: " + salary);
        }
    }

    /**
     * Method to display the employee's information.
     */
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
        System.out.println("Annual Salary: $" + calculateAnnualSalary());
    }
    
     public static void main(String[] args) {
        // Create an instance of the Employee class
        Employee employee1 = new Employee("Durjoy Barua", "Software Engineer", 75000.0);

        // Display the employee's information
        System.out.println("Initial Employee Information:");
        employee1.displayEmployeeInfo();

        // Calculate and display the annual salary
        double annualSalary = employee1.calculateAnnualSalary();
        System.out.println("\nAnnual Salary: $" + annualSalary);

        // Update the employee's salary
        employee1.updateSalary(80000.0);
        employee1.updateSalary(-1000); //test case for invalid salary

        // Display the updated information
        System.out.println("\nUpdated Employee Information:");
        employee1.displayEmployeeInfo();
        
        //Demonstrate the use of getter methods
        System.out.println("\nName using getter: " + employee1.getName());
        System.out.println("Job Title using getter: " + employee1.getJobTitle());
        System.out.println("Salary using getter: $" + employee1.getSalary());
    }
}