
package CoreProgramming;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    // Generates a random guess between min and max (inclusive)
    public static int generateGuess(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    // Gets feedback from the user: "high", "low", or "correct"
    public static String getUserFeedback(int guess, Scanner scanner) {
        System.out.print("Is the guess " + guess + " too high, too low, or correct? (Enter: high/low/correct): ");
        return scanner.nextLine().trim().toLowerCase();
    }

    // Updates the guessing range based on user feedback
    public static int[] updateRange(int min, int max, int guess, String feedback) {
        if (feedback.equals("high")) {
            max = guess - 1;
        } else if (feedback.equals("low")) {
            min = guess + 1;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1, max = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100. The computer will try to guess it!");

        while (!found && min <= max) {
            int guess = generateGuess(min, max);
            String feedback = getUserFeedback(guess, scanner);

            if (feedback.equals("correct")) {
                System.out.println("Yay! The computer guessed your number: " + guess);
                found = true;
            } else if (feedback.equals("high") || feedback.equals("low")) {
                int[] range = updateRange(min, max, guess, feedback);
                min = range[0];
                max = range[1];
            } else {
                System.out.println("Invalid feedback. Please enter 'high', 'low', or 'correct'.");
            }
        }

        if (!found) {
            System.out.println("It seems there was a mistake in the feedback. Game over.");
        }

        scanner.close();
    }
}
