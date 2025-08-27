import java.util.Scanner;

public class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0, i = 1;

            while (i <= n) {
                loopSum += i;
                i++;
            }

            System.out.println("Formula sum = " + formulaSum + ", Loop sum = " + loopSum);
        } else {
            System.out.println("Not a natural number!");
        }
    }
}
