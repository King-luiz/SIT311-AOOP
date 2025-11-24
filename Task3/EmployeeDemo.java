// ================================================
// Interface: Bonus
// Defines the behavior for calculating employee bonus
// ================================================
interface Bonus {
    double calculateBonus();
}

// ================================================
// Abstract Class: Employee
// Represents a general employee with common fields
// ================================================
abstract class Employee {
    String name;
    double salary;

    // Constructor to initialize name and salary
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Abstract method that each subclass must implement
    abstract void displayDetails();
}

// ================================================
// Subclass: Manager
// Inherits Employee and implements Bonus interface
// Manager receives 20% bonus
// ================================================
class Manager extends Employee implements Bonus {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    // Manager bonus = 20% of salary
    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }

    // Display manager details
    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("----------------------------------------");
    }
}

// ================================================
// Subclass: Developer
// Inherits Employee and implements Bonus interface
// Developer receives 10% bonus
// ================================================
class Developer extends Employee implements Bonus {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    // Developer bonus = 10% of salary
    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }

    // Display developer details
    @Override
    void displayDetails() {
        System.out.println("Developer Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("----------------------------------------");
    }
}

// ================================================
// Demo Class: EmployeeDemo
// Demonstrates polymorphism and method overriding
// ================================================
public class EmployeeDemo {
    public static void main(String[] args) {

        // Creating objects using polymorphism
        Employee e1 = new Manager("Alice", 80000);
        Employee e2 = new Developer("Bob", 60000);

        // Display details of both employees
        e1.displayDetails();
        e2.displayDetails();
    }
}
