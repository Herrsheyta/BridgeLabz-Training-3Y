import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Count digits
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Step 3: Store digits in an array
        int[] digits = new int[count];
        temp = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Step 4: Create reverse array
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        // Step 5: Display reverse number
        System.out.print("Reversed Number: ");
        for (int d : reversed) {
            System.out.print(d);
        }

        sc.close();
    }
}
