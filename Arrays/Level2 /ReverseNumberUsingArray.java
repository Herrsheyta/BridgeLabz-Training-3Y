import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Convert to string to count digits
        String numStr = Integer.toString(number);
        int length = numStr.length();

        // Store digits in an array
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';  // Convert char to int
        }

        // Create a reversed array
        int[] reversed = new int[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = digits[length - 1 - i];
        }

        // Display reversed array (number)
        System.out.print("The reversed number is: ");
        for (int digit : reversed) {
            System.out.print(digit);
        }
    }
}
