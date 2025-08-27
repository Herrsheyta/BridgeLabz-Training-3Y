import java.util.Scanner;

public class ReverseNumberRecursion {

    // Recursive function to reverse a number
    static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;   // Base case
        }
        rev = (rev * 10) + (num % 10); // Append last digit
        return reverse(num / 10, rev); // Recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number as input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Call recursive function
        int reversed = reverse(num, 0);

        // Step 3: Print result
        System.out.println("Reversed number is: " + reversed);

        sc.close();
    }
}
