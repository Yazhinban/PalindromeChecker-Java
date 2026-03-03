/**
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * UC13: Performance Comparison
 * Goal: Compare the performance of different palindrome approaches.
 */
public class palindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        // Using the strategy pattern for comparison
        PalindromeStrategy stackStrategy = new StackStrategy();

        // Capture execution start time
        long startTime = System.nanoTime(); // [cite: 110]

        boolean isPalindrome = stackStrategy.check(input);

        // Capture execution end time
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long executionTime = endTime - startTime;

        // Display benchmarking results [cite: 108, 113]
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}