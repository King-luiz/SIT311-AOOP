// Calculator class demonstrating Method Overloading
class Calculator {
    // Overloaded method: adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method: adds two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Overloaded method: adds three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Method overloading in action
        System.out.println(calc.add(5, 10));       // Calls int version
        System.out.println(calc.add(5.5, 2.5));   // Calls double version
        System.out.println(calc.add(1, 2, 3));    // Calls three-parameter version
    }
}
