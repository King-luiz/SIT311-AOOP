import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        int percent = sc.nextInt();
        String grade;
        if (percent > 90) {
            grade = "A";
            System.out.println("Well done");
        } else if (percent > 75) {
            grade = "B";
            System.out.println("Good job");
        } else if (percent > 65) {
            grade = "C";
            System.out.println("You passed");
        } else {
            grade = "Fail";
            System.out.println("Better luck next time");
        }
        System.out.println("Grade: " + grade);
    }
}
