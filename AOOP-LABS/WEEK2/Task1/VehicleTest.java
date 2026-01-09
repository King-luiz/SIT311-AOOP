// Title: Vehicle Inheritance and Method Overriding
// Description: Demonstrates inheritance by extending a superclass and
//              overriding its method in subclasses.

// Superclass
class Vehicle {

    // Method to be overridden
    public void move() {
        System.out.println("The vehicle is moving...");
    }
}

// Subclass 1: Car
class Car extends Vehicle {

    @Override
    public void move() {
        System.out.println("The car is driving on the road.");
    }
}

// Subclass 2: Truck
class Truck extends Vehicle {

    @Override
    public void move() {
        System.out.println("The truck is transporting goods.");
    }
}

public class VehicleTest {
    public static void main(String[] args) {

        // Create objects of the subclasses
        Vehicle v1 = new Car();
        Vehicle v2 = new Truck();

        // Call overridden methods
        System.out.println("Car Action:");
        v1.move();

        System.out.println("\nTruck Action:");
        v2.move();
    }
}
