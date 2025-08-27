import java.util.Scanner;

public class FactorialRecursion_1{

    // Recursive method to calculate factorial
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;   // Base case
        }
        return n * factorial(n - 1);  // Recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Call recursive function
        long fact = factorial(num);

        // Step 3: Display result
        System.out.println("Factorial of " + num + " is: " + fact);

        sc.close();
    }
}
