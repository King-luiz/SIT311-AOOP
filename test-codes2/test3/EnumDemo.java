// Enum representing days of the week
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

public class EnumDemo {
    public static void main(String[] args) {

        // Create a variable using the enum
        Day today = Day.MONDAY;

        // Switch statement gives cleaner output for each day
        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;

            case TUESDAY:
                System.out.println("It's Tuesday, keep going!");
                break;

            case WEDNESDAY:
                System.out.println("Halfway through the week!");
                break;

            case THURSDAY:
                System.out.println("Almost there, keep pushing!");
                break;

            case FRIDAY:
                System.out.println("It's Friday! Weekend loading...");
                break;

            default:
                System.out.println("Invalid day.");
        }
    }
}
