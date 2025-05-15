import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> students; // A list to hold the students in the school
    private List<Teacher> teachers; // A list to hold the teachers in the school
    private List<Classroom> classrooms; // A list to hold the classrooms in the school

    // Constructor to initialize the School with empty lists for students, teachers, and classes
    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.classrooms = new ArrayList<>();
    }

    /**
     * Adds a student to the school.
     *
     * @param student The Student object to be added.
     */
    public void addStudent(Student student) {
        if (student != null) {
            this.students.add(student);
            System.out.println(student.getName() + " has been added to the school.");
        } else {
            System.out.println("Cannot add a null student.");
        }
    }

    /**
     * Removes a student from the school based on their ID.
     *
     * @param studentId The ID of the student to be removed.
     */
    public void removeStudent(int studentId) {
        // Iterate through the list of students to find the student with the given ID
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getId() == studentId) {
                Student removedStudent = this.students.remove(i);
                System.out.println(removedStudent.getName() + " (ID: " + removedStudent.getId() + ") has been removed from the school.");
                return; // Exit the method once the student is found and removed
            }
        }
        System.out.println("Student with ID '" + studentId + "' not found in the school.");
    }

    /**
     * Adds a teacher to the school.
     *
     * @param teacher The Teacher object to be added.
     */
    public void addTeacher(Teacher teacher) {
        if (teacher != null) {
            this.teachers.add(teacher);
            System.out.println(teacher.getName() + " has been added to the school.");
        } else {
            System.out.println("Cannot add a null teacher.");
        }
    }

    /**
     * Removes a teacher from the school based on their ID.
     *
     * @param teacherId The ID of the teacher to be removed.
     */
    public void removeTeacher(int teacherId) {
        // Iterate through the list of teachers to find the teacher with the given ID
        for (int i = 0; i < this.teachers.size(); i++) {
            if (this.teachers.get(i).getId() == teacherId) {
                Teacher removedTeacher = this.teachers.remove(i);
                System.out.println(removedTeacher.getName() + " (ID: " + removedTeacher.getId() + ") has been removed from the school.");
                return; // Exit the method once the teacher is found and removed
            }
        }
        System.out.println("Teacher with ID '" + teacherId + "' not found in the school.");
    }

    /**
     * Creates a new classroom and adds it to the school's list of classrooms.
     *
     * @param className The name or identifier of the classroom (e.g., "Grade 6A", "Science Lab").
     */
    public void createClassroom(String className) {
        if (className != null && !className.trim().isEmpty()) {
            Classroom newClassroom = new Classroom(className);
            this.classrooms.add(newClassroom);
            System.out.println("Classroom '" + className + "' has been created.");
        } else {
            System.out.println("Classroom name cannot be empty.");
        }
    }

    /**
     * Displays all the students currently in the school.
     */
    public void displayStudents() {
        if (this.students.isEmpty()) {
            System.out.println("No students in the school.");
        } else {
            System.out.println("\nStudents in the school:");
            for (Student student : this.students) {
                System.out.println("- Name: " + student.getName() + ", ID: " + student.getId());
            }
        }
    }

    /**
     * Displays all the teachers currently in the school.
     */
    public void displayTeachers() {
        if (this.teachers.isEmpty()) {
            System.out.println("No teachers in the school.");
        } else {
            System.out.println("\nTeachers in the school:");
            for (Teacher teacher : this.teachers) {
                System.out.println("- Name: " + teacher.getName() + ", ID: " + teacher.getId() + ", Subject: " + teacher.getSubject());
            }
        }
    }

    /**
     * Displays all the classrooms in the school.
     */
    public void displayClassrooms() {
        if (this.classrooms.isEmpty()) {
            System.out.println("No classrooms in the school.");
        } else {
            System.out.println("\nClassrooms in the school:");
            for (Classroom classroom : this.classrooms) {
                System.out.println("- " + classroom.getName());
            }
        }
    }

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
}

// A simple Student class with name and ID
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

// A simple Teacher class with name, ID, and subject
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

// A simple Classroom class with a name
class Classroom {
    private String name;

    public Classroom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}