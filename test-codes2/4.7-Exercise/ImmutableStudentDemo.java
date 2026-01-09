// =========================================================
// 4.7 PRACTICE EXERCISE
// Creating an Immutable Student class
// =========================================================

// Making the class final prevents inheritance.
// Immutable classes should not be subclassed.
final class Student {

    // Fields must be private and final
    // so they cannot be changed after object creation.
    private final String name;
    private final String regNumber;
    private final String course;

    // Constructor: assigns values ONCE
    // No setters will be provided.
    public Student(String name, String regNumber, String course) {
        this.name = name;
        this.regNumber = regNumber;
        this.course = course;
    }

    // Only getter methods to VIEW data.
    // No method modifies the internal fields.
    public String getName() {
        return name;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getCourse() {
        return course;
    }
}


// =========================================================
// DEMO CLASS — creates and displays immutable Student object
// =========================================================
public class ImmutableStudentDemo {

    public static void main(String[] args) {

        // Creating an immutable Student object
        Student s1 = new Student("Alice Mwangi", "SEKU12345", "Computer Science");

        // Displaying details using getters
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Registration Number: " + s1.getRegNumber());
        System.out.println("Course: " + s1.getCourse());

        // s1.name = "New Name";    Not allowed
        // s1.setName("New Name");  There is no setter!
        // s1 is fully immutable.
    }
}
