import java.util.Scanner;

public class GCDRecursion {

    // Recursive function to find GCD
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;   // Base case
        }
        return gcd(b, a % b);  // Recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take two numbers as input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Step 2: Call gcd function
        int result = gcd(num1, num2);

        // Step 3: Print result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);

        sc.close();
    }
}
