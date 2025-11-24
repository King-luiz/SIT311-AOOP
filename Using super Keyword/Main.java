// Example 3: Using super Keyword

// Parent class
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
    }
}

// Child class
class Student extends Person {
    int grade;

    Student(String name, int grade) {
        super(name); // Call parent constructor
        this.grade = grade;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Grade: " + grade);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Alice", 10);
        s.displayInfo();
    }
}
