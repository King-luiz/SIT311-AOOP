// ===============================
// INTERFACE (Drivable)
// ===============================
// An interface defines a behavior or capability that a class must perform.
// Here, any class that implements Drivable must provide its own accelerate() method.
interface Drivable {
    void accelerate();   // Abstract method representing acceleration behavior
}



// ===============================
// ABSTRACT CLASS (Vehicle)
// ===============================
// An abstract class represents a partially defined blueprint.
// It may contain abstract and concrete methods.
// Here, all vehicles must implement their own brake() method.
abstract class Vehicle {
    abstract void brake();   // Abstract method that subclasses must override
}



// ===============================
// SUBCLASS (Car)
// ===============================
// Car inherits from Vehicle (abstract class) and implements Drivable (interface).
// This demonstrates how a single class can:
//   ✔ Extend an abstract class
//   ✔ Implement an interface
class Car extends Vehicle implements Drivable {

    // Implementing the accelerate() method from Drivable interface
    @Override
    public void accelerate() {
        System.out.println("Car accelerating...");
    }

    // Implementing the brake() method from Vehicle abstract class
    @Override
    void brake() {
        System.out.println("Car braking...");
    }
}



// ===============================
// DEMO CLASS (CombinedDemo)
// ===============================
// This class contains the main() method used to run the program.
// It demonstrates polymorphism and object behavior.
public class CombinedDemo {
    public static void main(String[] args) {

        // Creating an object of Car
        Car c = new Car();

        // Calling methods implemented from both interface and abstract class
        c.accelerate();  // Output: Car accelerating...
        c.brake();       // Output: Car braking...
    }
}
