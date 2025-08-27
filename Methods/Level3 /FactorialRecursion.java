import java.util.Scanner;

public class FactorialRecursion {

    // Recursive method
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base case
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Call factorial function
        long result = factorial(num);

        // Step 3: Print result
        System.out.println("Factorial of " + num + " is: " + result);

        sc.close();
    }
}
