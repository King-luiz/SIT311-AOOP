// Title: Demonstration of super Keyword
// Description: Shows how to access parent class constructor, fields,
//              and methods using the 'super' keyword.

// Parent class
class Person {

    String name;

    // Parent class constructor
    public Person(String name) {
        this.name = name;
    }

    // Parent class method
    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

// Child class
class Student extends Person {

    String course;

    // Child constructor calling parent constructor using super()
    public Student(String name, String course) {
        super(name);   // Calls Person(name)
        this.course = course;
    }

    // Overriding displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls Person's displayInfo()
        System.out.println("Course: " + course);
    }
}

public class SupeDemoTest {
    public static void main(String[] args) {

        Student s = new Student("Lewins Luiz", "Computer Science");

        s.displayInfo();  // Calls overridden method
    }
}
