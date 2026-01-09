import java.util.Scanner;



class IfStatement {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("The number is negative.");
            System.out.println("You entered: " + number);
        }
        else{
            System.out.println("The number is Positive.");
            System.out.println("You entered: " + number);

        }
    }
}