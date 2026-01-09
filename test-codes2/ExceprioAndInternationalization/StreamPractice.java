import java.util.*;
import java.util.stream.*;

// =====================================================
// 7.9 PRACTICE EXERCISE
// Demonstrating Streams API in Java
// =====================================================
public class StreamPractice {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 30, 8, 25);

        System.out.println("Original List: " + numbers);

        System.out.println("Numbers greater than 15 (sorted):");

        // Using Streams API
        numbers.stream()                  // Convert list to stream
               .filter(n -> n > 15)        // Keep only numbers greater than 15
               .sorted()                  // Sort the filtered numbers
               .forEach(n -> System.out.println(n));  // Print each number
    }
}
