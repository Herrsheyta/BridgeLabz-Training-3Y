import java.util.Scanner;

public class FactorsCalculator {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    public static int product(int[] arr) {
        int product = 1;
        for (int n : arr) product *= n;
        return product;
    }

    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += Math.pow(n, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum = " + sum(factors));
        System.out.println("Product = " + product(factors));
        System.out.println("Sum of Squares = " + sumOfSquares(factors));
    }
}
