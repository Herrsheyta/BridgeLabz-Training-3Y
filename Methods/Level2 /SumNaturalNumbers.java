import java.util.Scanner;

public class SumNaturalNumbers {
    public static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
            return;
        }

        int recursive = sumRecursive(n);
        int formula = sumFormula(n);

        System.out.println("Sum using recursion = " + recursive);
        System.out.println("Sum using formula = " + formula);
        System.out.println("Both are equal? " + (recursive == formula));
    }
}
