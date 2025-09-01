import java.util.Scanner;

public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Compare manually
        int minLen = Math.min(str1.length(), str2.length());
        int result = 0; // 0 = equal, negative = str1 < str2, positive = str1 > str2

        for (int i = 0; i < minLen; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                result = ch1 - ch2;  // Positive if ch1 > ch2, negative if ch1 < ch2
                break;
            }
        }

        // If all compared chars are equal but lengths differ
        if (result == 0 && str1.length() != str2.length()) {
            result = str1.length() - str2.length();
        }

        // Print result
        if (result == 0) {
            System.out.println("Strings are equal.");
        } else if (result < 0) {
            System.out.println("\"" + str1 + "\" is lexicographically smaller than \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str2 + "\"");
        }

        scanner.close();
    }
}
