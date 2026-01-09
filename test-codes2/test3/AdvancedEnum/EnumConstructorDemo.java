import java.util.Scanner;

// =============================================
// ENUM WITH CONSTRUCTOR AND CUSTOM MESSAGE
// =============================================
enum Day {
    MONDAY("Start of the week"),
    TUESDAY("Keep going"),
    WEDNESDAY("Midweek"),
    THURSDAY("Almost there"),
    FRIDAY("Weekend loading...");

    private String message;   // Field to store custom data

    // Constructor (private by default in enums)
    Day(String message) {
        this.message = message;
    }

    // Getter method
    public String getMessage() {
        return message;
    }
}


// =============================================
// MAIN PROGRAM — ALLOWS USER INPUT
// =============================================
public class EnumConstructorDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day (e.g., MONDAY, TUESDAY, FRIDAY):");
        String userInput = sc.nextLine().toUpperCase(); 
        // convert to uppercase so input becomes ENUM-friendly

        try {
            // Convert user input to ENUM type
            Day today = Day.valueOf(userInput);

            // Show output
            System.out.println("Today is " + today);
            System.out.println("Message: " + today.getMessage());

        } catch (IllegalArgumentException e) {
            // Handles invalid input
            System.out.println("Invalid day entered. Please enter a correct day name.");
        }
    }
}
