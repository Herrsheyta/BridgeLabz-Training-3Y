import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Not a natural number.");
            return;
        }

        int[] evens = new int[number/2 + 1];
        int[] odds = new int[number/2 + 1];
        int eIndex = 0, oIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                evens[eIndex++] = i;
            else
                odds[oIndex++] = i;
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oIndex; i++) System.out.print(odds[i] + " ");
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < eIndex; i++) System.out.print(evens[i] + " ");
    }
}
