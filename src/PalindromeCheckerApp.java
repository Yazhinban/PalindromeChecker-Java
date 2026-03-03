import java.util.Stack;

/**
 * UC12: Strategy Pattern for Palindrome Algorithms
 * Goal: Choose a palindrome algorithm dynamically at runtime.
 */

// 1. Define the Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// 2. Implementation: Stack-based Strategy
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) return false;
        String cleaned = input.toLowerCase();
        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        // Compare stack output (reverse) with original sequence
        for (char c : cleaned.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// 3. Implementation: Two-Pointer Strategy (Optimized)
class TwoPointerStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) return false;
        int start = 0, end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}

// MAIN APPLICATION CLASS
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String testInput = "Level";

        // Inject Strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        System.out.println("Input: " + testInput);
        System.out.println("Using StackStrategy: " + strategy.check(testInput));

        // Switch strategy dynamically
        strategy = new TwoPointerStrategy();
        System.out.println("Using TwoPointerStrategy: " + strategy.check(testInput));
    }
}