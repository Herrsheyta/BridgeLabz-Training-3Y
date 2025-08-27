import java.util.Scanner;

public class ReverseNumberRecursion_1 {

    // Recursive method to reverse a number
    static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;  // base case
        }
        return reverse(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Call recursive function
        int reversed = reverse(num, 0);

        // Step 3: Display result
        System.out.println("Reversed number is: " + reversed);

        sc.close();
    }
}
