import java.time.LocalDate;
import java.time.Period;

// Define the EmployeeInfo class
public class EmployeeInfo {

    // Attributes for employee's name, salary, and hire date
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Constructor to initialize the employee information
    public EmployeeInfo(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Method to calculate years of service based on hire date and current date
    public int calculateYearsOfService() {
        LocalDate today = LocalDate.now(); // Get the current date
        if (hireDate != null && !hireDate.isAfter(today)) {
            // Calculate the period between the hire date and today
            return Period.between(hireDate, today).getYears();
        } else {
            return 0;
        }
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + calculateYearsOfService());
    }

    // Main method to test the EmployeeInfo class
    public static void main(String[] args) {
        // Create an EmployeeInfo object
        EmployeeInfo employee = new EmployeeInfo("Durjoy Barua", 85000.0, LocalDate.of(2012, 6, 1));

        // Display the employee's information
        employee.displayInfo();
    }
}
