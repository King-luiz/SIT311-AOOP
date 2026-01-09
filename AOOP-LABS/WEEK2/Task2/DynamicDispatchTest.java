// Title: Dynamic Method Dispatch Demonstration
// Description: Shows how a superclass reference can call overridden
//              methods of subclass objects at runtime.

class Vehicle {

    public void move() {
        System.out.println("The vehicle is moving...");
    }
}

class Car extends Vehicle {

    @Override
    public void move() {
        System.out.println("The car is driving smoothly.");
    }
}

class Truck extends Vehicle {

    @Override
    public void move() {
        System.out.println("The truck is carrying heavy cargo.");
    }
}

public class DynamicDispatchTest {

    public static void main(String[] args) {

        // Superclass reference but different subclass objects
        Vehicle vehicle;

        // Point to Car object
        vehicle = new Car();
        System.out.println("Calling move() on Car object:");
        vehicle.move();   // Calls Car's move()

        System.out.println();

        // Point to Truck object
        vehicle = new Truck();
        System.out.println("Calling move() on Truck object:");
        vehicle.move();   // Calls Truck's move()
    }
}
