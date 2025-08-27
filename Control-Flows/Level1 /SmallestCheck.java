import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        boolean isSmallest = (num1 < num2 && num1 < num3);
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
