import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;

            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            System.out.println("Formula sum = " + formulaSum + ", Loop sum = " + loopSum);
        } else {
            System.out.println("Not a natural number!");
        }
    }
}
