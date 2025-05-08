import java.util.ArrayList;
import java.util.List;

// Define the Student class
public class Student {

    // Attributes for the student's name, grade, and a list of courses
    private String name;
    private int grade;
    private List<String> courses;

    // Constructor to initialize the student's name and grade
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>(); // Initialize the courses list
    }

    // Method to add a course to the student's course list
    public void addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println(course + " has been added.");
        } else {
            System.out.println(course + " is already enrolled.");
        }
    }

    // Method to remove a course from the student's course list
    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println(course + " has been removed.");
        } else {
            System.out.println(course + " is not in the enrolled list.");
        }
    }

    // Method to display student details and their courses
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Enrolled Courses: " + courses);
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 10);

        // Add some courses
        student.addCourse("Mathematics");
        student.addCourse("Science");
        student.addCourse("History");

        // Try adding a duplicate course
        student.addCourse("Mathematics");

        // Remove a course
        student.removeCourse("Science");

        // Try removing a course not enrolled in
        student.removeCourse("Art");

        // Display final student info
        student.displayStudentInfo();
    }
}
