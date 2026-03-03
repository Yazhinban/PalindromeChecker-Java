/**
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * UC11: Object-Oriented Palindrome Service
 * This class demonstrates palindrome validation using an object-oriented design.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Create an instance of the service class
        PalindromeService service = new PalindromeService();

        String input = "racecar"; // Example input
        boolean result = service.checkPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }
}

/**
 * Service class that contains palindrome logic.
 * Demonstrates Encapsulation and Single Responsibility Principle.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}