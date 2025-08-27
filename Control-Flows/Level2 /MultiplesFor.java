import java.util.Scanner;

public class MultiplesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number (<100): ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input.");
            return;
        }

        for (int i = 100; i >= 1; i--) {
            if (i % number == 0)
                System.out.println(i);
        }
    }
}
