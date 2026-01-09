// Example 1: Basic Inheritance

// Parent class
class Vehicle {
    String brand = "Toyota";

    void honk() {
        System.out.println("Beep! Beep!");
    }
}

// Child class
class Car extends Vehicle {
    int wheels = 4;

    void display() {
        System.out.println("Brand: " + brand + ", Wheels: " + wheels);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();    // inherited method from Vehicle
        myCar.display(); // method defined in Car
    }
}
