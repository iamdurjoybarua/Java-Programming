# Simple School Management System in Java

This repository contains a basic Java program that simulates a simple school management system. It includes three main classes: `School` to manage students, teachers, and classrooms; `Student` to represent individual students; `Teacher` to represent teachers; and `Classroom` to represent classrooms.

## Overview

The system consists of the following classes:

-   **`School`**: This class manages lists of `Student`, `Teacher`, and `Classroom` objects. It provides functionalities to:
    -   Add and remove students.
    -   Add and remove teachers.
    -   Create and manage classrooms.
    -   Display all students, teachers, and classrooms in the school.
-   **`Student`**: This class represents a student with a name and ID.
-   **`Teacher`**: This class represents a teacher with a name, ID, and subject.
-   **`Classroom`**: This class represents a classroom with a name.

The `main` method within the `School` class demonstrates the usage of these functionalities by creating a school, adding students and teachers, creating classrooms, displaying the school's information, and removing some individuals.

## Getting Started

To run this program, you need to have Java Development Kit (JDK) installed on your system.

1.  **Save the code:** Save the provided Java code into four files: `School.java`, `Student.java`, `Teacher.java`, and `Classroom.java` in the same directory.
2.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where you saved the files, and compile the Java files using the following command:

    ```bash
    javac School.java Student.java Teacher.java Classroom.java
    ```

    This will generate `School.class`, `Student.class`, `Teacher.class`, and `Classroom.class` files.
3.  **Run the program:** Execute the `School` class using the following command:

    ```bash
    java School
    ```

    This will run the `main` method in the `School` class and you will see the output in your console.

## Functionality

### Creating a School Object

The `School` class constructor initializes a new school with empty lists for students, teachers, and classrooms.

```java
public School() {
    this.students = new ArrayList<>();
    this.teachers = new ArrayList<>();
    this.classrooms = new ArrayList<>();
}
```

**Usage:**

```java
School mySchool = new School();
```

### Adding Students

The `addStudent(Student student)` method adds a `Student` object to the school's list of students. It checks if the provided student is not null before adding.

```java
public void addStudent(Student student) {
    if (student != null) {
        this.students.add(student);
        System.out.println(student.getName() + " has been added to the school.");
    } else {
        System.out.println("Cannot add a null student.");
    }
}
```

**Usage:**

```java
Student alice = new Student("Alice", 101);
mySchool.addStudent(alice);
```

### Removing Students

The `removeStudent(int studentId)` method removes a student from the school based on their ID.

```java
public void removeStudent(int studentId) {
    for (int i = 0; i < this.students.size(); i++) {
        if (this.students.get(i).getId() == studentId) {
            Student removedStudent = this.students.remove(i);
            System.out.println(removedStudent.getName() + " (ID: " + removedStudent.getId() + ") has been removed from the school.");
            return; // Exit the method once the student is found and removed
        }
    }
    System.out.println("Student with ID '" + studentId + "' not found in the school.");
}
```

**Usage:**

```java
mySchool.removeStudent(102);
```

### Adding Teachers

The `addTeacher(Teacher teacher)` method adds a `Teacher` object to the school's list of teachers. It checks if the provided teacher is not null before adding.

```java
public void addTeacher(Teacher teacher) {
    if (teacher != null) {
        this.teachers.add(teacher);
        System.out.println(teacher.getName() + " has been added to the school.");
    } else {
        System.out.println("Cannot add a null teacher.");
    }
}
```

**Usage:**

```java
Teacher smith = new Teacher("Ms. Smith", 201, "Math");
mySchool.addTeacher(smith);
```

### Removing Teachers

The `removeTeacher(int teacherId)` method removes a teacher from the school based on their ID.

```java
public void removeTeacher(int teacherId) {
    for (int i = 0; i < this.teachers.size(); i++) {
        if (this.teachers.get(i).getId() == teacherId) {
            Teacher removedTeacher = this.teachers.remove(i);
            System.out.println(removedTeacher.getName() + " (ID: " + removedTeacher.getId() + ") has been removed from the school.");
            return; // Exit the method once the teacher is found and removed
        }
    }
    System.out.println("Teacher with ID '" + teacherId + "' not found in the school.");
}
```

**Usage:**

```java
mySchool.removeTeacher(201);
```

### Creating Classrooms

The `createClassroom(String className)` method creates a new `Classroom` object and adds it to the school's list of classrooms.

```java
public void createClassroom(String className) {
    if (className != null && !className.trim().isEmpty()) {
        Classroom newClassroom = new Classroom(className);
        this.classrooms.add(newClassroom);
        System.out.println("Classroom '" + className + "' has been created.");
    } else {
        System.out.println("Classroom name cannot be empty.");
    }
}
```

**Usage:**

```java
mySchool.createClassroom("Grade 7A");
```

### Displaying School Information

The `displayStudents()`, `displayTeachers()`, and `displayClassrooms()` methods display the lists of students, teachers, and classrooms currently in the school, respectively.

**Usage:**

```java
mySchool.displayStudents();
mySchool.displayTeachers();
mySchool.displayClassrooms();
```

## `Student` Class

The `Student` class represents a student with a name and a unique ID.

```java
class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
```

## `Teacher` Class

The `Teacher` class represents a teacher with a name, a unique ID, and the subject they teach.

```java
class Teacher {
    private String name;
    private int id;
    private String subject;

    public Teacher(String name, int id, String subject) {
        this.name = name;
        this.id = id;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }
}
```

## `Classroom` Class

The `Classroom` class represents a classroom with a name or identifier.

```java
class Classroom {
    private String name;

    public Classroom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

## Example Usage

The `main` method in the `School` class demonstrates the creation of a school, adding students and teachers, creating classrooms, displaying the initial state, removing some members, and then displaying the updated state.

```java
public static void main(String[] args) {
    // Create a new School object
    School school = new School();

    // Create some Student objects
    Student student1 = new Student("Alice", 101);
    Student student2 = new Student("Bob", 102);
    Student student3 = new Student("Charlie", 103);

    // Add students to the school
    school.addStudent(student1);
    school.addStudent(student2);
    school.addStudent(student3);
    school.addStudent(null); // Try adding a null student

    // Create some Teacher objects
    Teacher teacher1 = new Teacher("Ms. Smith", 201, "Math");
    Teacher teacher2 = new Teacher("Mr. Jones", 202, "Science");

    // Add teachers to the school
    school.addTeacher(teacher1);
    school.addTeacher(teacher2);
    school.addTeacher(null); // Try adding a null teacher

    // Create some classrooms
    school.createClassroom("Grade 7A");
    school.createClassroom("Grade 8B");
    school.createClassroom("Science Lab");
    school.createClassroom(""); // Try creating a classroom with an empty name
    school.createClassroom(null); // Try creating a classroom with a null name

    // Display the students, teachers, and classrooms
    school.displayStudents();
    school.displayTeachers();
    school.displayClassrooms();

    // Remove a student and a teacher
    school.removeStudent(102);
    school.removeTeacher(201);

    // Display the updated lists
    school.displayStudents();
    school.displayTeachers();
}
```

## Potential Enhancements

  - **Assigning Students to Classrooms:** Implement functionality to assign students to specific classrooms.
  - **Adding Courses/Subjects:** Introduce a `Course` class and allow teachers to teach specific courses.
  - **Grading System:** Implement a basic grading system to record and manage student grades.
  - **Attendance Tracking:** Add functionality to track student attendance.
  - **Data Persistence:** Implement saving and loading school data to a file or database.
  - **User Interface:** Develop a command-line interface (CLI) or a graphical user interface (GUI) for easier interaction.
  - **Search Functionality:** Implement features to search for students or teachers by name or ID.

## Author

Durjoy Barua / https://github.com/iamdurjoybarua
