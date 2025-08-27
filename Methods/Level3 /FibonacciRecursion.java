import java.util.Scanner;

public class FibonacciRecursion {

    // Recursive method to find nth Fibonacci number
    static int fibonacci(int n) {
        if (n == 0) return 0;   // base case
        if (n == 1) return 1;   // base case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of terms
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        // Step 2: Print Fibonacci series
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
    }
}
