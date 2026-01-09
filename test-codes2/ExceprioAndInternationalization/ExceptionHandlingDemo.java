import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Ask the user to enter two numbers
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // This may cause ArithmeticException if b is 0
            int result = a / b;

            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Error: You cannot divide by zero.");
        }
        catch (Exception e) {
            // Handles wrong input (e.g. letters instead of numbers)
            System.out.println("Error: Invalid input. Please enter numbers only.");
        }
        finally {
            // This always executes
            System.out.println("Program finished safely.");
        }
    }
}
