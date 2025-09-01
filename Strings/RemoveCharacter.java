import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input character to remove
        System.out.print("Enter the character to remove: ");
        char toRemove = scanner.next().charAt(0);

        // Build modified string
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch != toRemove) {
                result.append(ch);
            }
        }

        // Output result
        System.out.println("Modified String: " + result.toString());

        scanner.close();
    }
}
