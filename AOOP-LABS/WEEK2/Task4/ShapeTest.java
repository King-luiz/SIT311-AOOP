// Title: Shape Hierarchy with Overridden area() Method
// Description: Demonstrates inheritance and method overriding
//              using Circle and Rectangle classes.

// Superclass
class Shape {

    // Method to be overridden by subclasses
    public double area() {
        return 0;
    }
}

// Subclass 1: Circle
class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding area() method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass 2: Rectangle
class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding area() method
    @Override
    public double area() {
        return length * width;
    }
}

public class ShapeTest {
    public static void main(String[] args) {

        // Create shape objects (runtime polymorphism)
        Shape s1 = new Circle(5.0);          // radius = 5
        Shape s2 = new Rectangle(4.0, 6.0);  // length=4, width=6

        // Display results
        System.out.println("Area of Circle: " + s1.area());
        System.out.println("Area of Rectangle: " + s2.area());
    }
}
