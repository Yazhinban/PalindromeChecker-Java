public class PalindromeCheckerApp {
    To implement UC5: Stack-Based Palindrome Checker, follow these instructions to use the LIFO (Last In First Out) principle for validation.
+1

        💻 Step 1: Create the Java File
    In your src folder, create a new Java Class.


    File Name: UseCase5PalindromeCheckerApp

📝 Step 2: The Code
    This version uses the java.util.Stack class to reverse the characters for comparison.
+1

    Java
import java.util.Stack;

    /**
     * Use Case 5: Stack Based Palindrome Checker
     * Description:
     * This class validates a palindrome using a Stack
     * data structure which follows the LIFO principle.
     * @author Developer
     * @version 5.0
     */
    public class UseCase5PalindromeCheckerApp {
        /**
         * Application entry point for UC5.
         * @param args Command-line arguments
         */
        public static void main(String[] args) {
            String input = "noon";
            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            boolean isPalindrome = true;
            for (char c : input.toCharArray()) {
                if (c != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Input: " + input);
            System.out.println("Is Palindrome?: " + isPalindrome);
        }
}