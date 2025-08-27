import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            if (num <= 0) {
                break;
            }
            total += num;
        }

        System.out.println("The total sum is " + total);
    }
}
