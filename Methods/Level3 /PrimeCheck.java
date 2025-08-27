import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // Step 2: Handle special cases
        if (num <= 1) {
            isPrime = false;
        } else {
            // Step 3: Check divisibility
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Step 4: Print result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close();
    }
}
