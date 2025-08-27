import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Convert number to string to easily process digits
        String numStr = Long.toString(Math.abs(number));
        int len = numStr.length();

        // Array to store digits
        int[] digits = new int[len];

        // Fill digits array
        for (int i = 0; i < len; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        // Frequency array (0-9)
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        // Display frequency
        System.out.println("\nDigit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times.");
            }
        }

        sc.close();
    }
}
