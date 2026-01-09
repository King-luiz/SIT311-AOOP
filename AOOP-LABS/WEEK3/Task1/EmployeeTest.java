// Title: Abstract Employee Salary Calculator
// Description: Demonstrates the use of abstract classes and method overriding
//              with Manager and Clerk subclasses.

// Abstract class
abstract class Employee {

    String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract double calculateSalary();

    // Common method for all employees
    public void display() {
        System.out.println("Employee Name: " + name);
    }
}

// Subclass 1: Manager
class Manager extends Employee {

    private double monthlySalary;

    public Manager(String name, double salary) {
        super(name);   // calls Employee constructor
        this.monthlySalary = salary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Subclass 2: Clerk
class Clerk extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public Clerk(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Manager("Lewins Luiz", 50000);
        Employee e2 = new Clerk("John Doe", 300, 160);

        // Display Manager Info
        e1.display();
        System.out.println("Monthly Salary: " + e1.calculateSalary());

        System.out.println();

        // Display Clerk Info
        e2.display();
        System.out.println("Monthly Salary: " + e2.calculateSalary());
    }
}
