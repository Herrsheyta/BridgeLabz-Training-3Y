public class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker("Level");
        System.out.println("Is Palindrome: " + pc.isPalindrome());
    }
}
