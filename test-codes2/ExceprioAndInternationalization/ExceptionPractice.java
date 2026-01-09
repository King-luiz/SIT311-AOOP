import java.util.Scanner;

// =====================================================
// 6.5 PRACTICE EXERCISE
// Demonstrating Exception Handling in Java
// =====================================================
public class ExceptionPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Ask the user for input
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // This may cause ArithmeticException
            int result = num1 / num2;

            // Display result if no exception occurs
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Error: You cannot divide by zero.");
        }
        catch (Exception e) {
            // Handles invalid input such as letters
            System.out.println("Error: Please enter valid integers only.");
        }
        finally {
            // This block always runs
            System.out.println("Program execution completed.");
        }
    }
}
