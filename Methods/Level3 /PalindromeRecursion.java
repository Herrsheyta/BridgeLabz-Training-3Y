import java.util.Scanner;

public class PalindromeRecursion {

    // Recursive method to check palindrome
    static boolean isPalindrome(String str, int start, int end) {
        // Base case: If start >= end, it's a palindrome
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Step 2: Check palindrome using recursion
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }

        sc.close();
    }
}
