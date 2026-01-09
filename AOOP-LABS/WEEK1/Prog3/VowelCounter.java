// Title: Vowel Counter Program
// Description: Counts the number of vowels in a given string using a simple loop.

import java.util.Scanner;

public class VowelCounter {

    // Method to count vowels
    public static int countVowels(String text) {
        text = text.toLowerCase();  // Convert to lowercase for easier checking
        int count = 0;

        // Loop through each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check for vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Output result
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);

        sc.close();
    }
}
