// Title: Rectangle Class with Area and Perimeter Calculation
// Description: Demonstrates class creation, constructors, getters, setters,
//              and methods to compute area and perimeter.

class Rectangle {

    // Private fields (data hiding)
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Test class to run the program
public class RectangleTest {
    public static void main(String[] args) {

        // Create object using default constructor
        Rectangle r1 = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.println("Area = " + r1.calculateArea());
        System.out.println("Perimeter = " + r1.calculatePerimeter());

        // Create object using parameterized constructor
        Rectangle r2 = new Rectangle(5.5, 3.2);
        System.out.println("\nRectangle with given values:");
        System.out.println("Area = " + r2.calculateArea());
        System.out.println("Perimeter = " + r2.calculatePerimeter());

        // Modifying values using setters
        r2.setLength(10);
        r2.setWidth(4);
        System.out.println("\nAfter modifying values:");
        System.out.println("Area = " + r2.calculateArea());
        System.out.println("Perimeter = " + r2.calculatePerimeter());
    }
}
