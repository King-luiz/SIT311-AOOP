// ========================================================
// AOOP FULL PROGRAM - Demonstrates ALL major OOP features
// ========================================================


// ========================================================
// 1. INTERFACE: Defines a behavior that classes must follow
// ========================================================
interface Drivable {
    void startEngine();   // Abstract method
}



// ========================================================
// 2. ABSTRACT CLASS: Partially implemented class
// ========================================================
abstract class Vehicle {
    protected String brand;     // Attribute (instance variable)
    protected int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Abstract method (must be overridden)
    abstract void drive();

    // Concrete method (shared by all subclasses)
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}



// ========================================================
// 3. CLASS WITH STATIC VARIABLES & METHODS
// ========================================================
class VehicleCounter {
    static int count = 0;     // Static attribute (shared by all objects)

    static void increment() { // Static method
        count++;
    }
}



// ========================================================
// 4. SUBCLASS: Car extends Vehicle and implements Drivable
// ========================================================
class Car extends Vehicle implements Drivable {

    private double speed;     // Encapsulation (private attribute)

    // Constructor using "super" to call parent constructor
    public Car(String brand, int year, double speed) {
        super(brand, year);
        this.speed = speed;  // "this" keyword
        VehicleCounter.increment();  // Count number of vehicles created
    }

    // Getter and setter (encapsulation)
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // Method overriding: implementing abstract method from Vehicle
    @Override
    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }

    // Interface implementation
    @Override
    public void startEngine() {
        System.out.println("Car engine started...");
    }

    // Method overloading: multiple methods with same name, different parameters
    public void accelerate() {
        System.out.println("Car accelerating normally...");
    }

    public void accelerate(int increase) {
        speed += increase;
        System.out.println("Car accelerated by " + increase + " km/h. New speed: " + speed);
    }



    // --------------------------------------------------------
    // Nested Inner Class: Represents the car's engine
    // --------------------------------------------------------
    class Engine {
        void showEngineType() {
            System.out.println("Engine Type: Hybrid Engine");
        }
    }
}



// ========================================================
// 5. SUBCLASS 2: Motorcycle (also extends Vehicle)
// Demonstrates polymorphism using multiple child classes
// ========================================================
class Motorcycle extends Vehicle implements Drivable {

    public Motorcycle(String brand, int year) {
        super(brand, year);
        VehicleCounter.increment();
    }

    @Override
    void drive() {
        System.out.println(brand + " motorcycle is zooming!");
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started...");
    }
}



// ========================================================
// 6. FINAL CLASS: Cannot be inherited
// ========================================================
final class ElectricScooter {
    public void ride() {
        System.out.println("Electric scooter is riding silently...");
    }
}



// ========================================================
// 7. MAIN CLASS (Demo)
// Shows: objects, polymorphism, inheritance, static use, etc.
// ========================================================
public class AOOPDemo {
    public static void main(String[] args) {

        // -----------------------------------------------------
        // Creating objects (demonstrates constructors & objects)
        // -----------------------------------------------------
        Car car1 = new Car("Toyota", 2020, 120);
        Motorcycle bike1 = new Motorcycle("Yamaha", 2018);

        System.out.println("============================================");
        System.out.println("                                       ");

        // Calling interface method
        car1.startEngine();
        bike1.startEngine();

        System.out.println("============================================");
        System.out.println("                                       ");

        // Calling overridden methods
        car1.drive();
        bike1.drive();

        System.out.println("============================================");
        System.out.println("                                       ");

        // Using getter & setter (encapsulation)
        System.out.println("Original Speed: " + car1.getSpeed());
        car1.setSpeed(150);
        System.out.println("Updated Speed: " + car1.getSpeed());

        System.out.println("============================================");
        System.out.println("                                       ");

        // Method Overloading
        car1.accelerate();
        car1.accelerate(30);

        System.out.println("============================================");
        System.out.println("                                       ");

        // Using nested class
        Car.Engine engine = car1.new Engine();
        engine.showEngineType();

        // -----------------------------------------------------
        // Demonstrating polymorphism: Parent reference → Child
        // -----------------------------------------------------
        Vehicle v1 = new Car("Honda", 2021, 100);
        Vehicle v2 = new Motorcycle("Suzuki", 2019);
        System.out.println("                                       ");

        v1.drive();   // Calls Car's implementation (polymorphism)
        v2.drive();   // Calls Motorcycle's implementation
        System.out.println("============================================");
        System.out.println("                                       ");

        // Display info from parent class
        v1.displayInfo();
        v2.displayInfo();
        System.out.println("============================================");
        System.out.println("                                       ");



        // -----------------------------------------------------
        // Final class example
        // -----------------------------------------------------
        ElectricScooter scooter = new ElectricScooter();
        scooter.ride();

        System.out.println("============================================");
        System.out.println("                                       ");



        // -----------------------------------------------------
        // Static variable demonstration
        // -----------------------------------------------------
        System.out.println("Total Vehicles Created: " + VehicleCounter.count);

        System.out.println("============================================");

        System.out.println("                                       ");
    }
}
