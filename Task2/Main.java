// Base class
class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to be overridden
    void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary); // Call parent constructor
        this.department = department;
    }

    @Override
    void displayDetails() {
        System.out.println("Manager -> Name: " + name + ", Salary: " + salary + 
                           ", Department: " + department);
    }
}

// Subclass: Developer
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary); // Call parent constructor
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        System.out.println("Developer -> Name: " + name + ", Salary: " + salary + 
                           ", Programming Language: " + programmingLanguage);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Using polymorphism: Employee references for child objects
        Employee e1 = new Manager("Alice", 75000, "Human Resources");
        Employee e2 = new Developer("Bob", 90000, "Java");

        // Calls overridden methods at runtime
        e1.displayDetails();
        e2.displayDetails();
    }
}
