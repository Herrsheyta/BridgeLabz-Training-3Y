import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100;
        String feedback;
        int guess;

        System.out.println("Think of a number between 1 and 100!");

        while (true) {
            guess = rand.nextInt(high - low + 1) + low;
            System.out.println("Computer guesses: " + guess);
            System.out.print("Is it high (h), low (l), or correct (c)? ");
            feedback = sc.next();

            if (feedback.equalsIgnoreCase("c")) {
                System.out.println("Computer guessed your number correctly!");
                break;
            } else if (feedback.equalsIgnoreCase("h")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("l")) {
                low = guess + 1;
            }
        }
        sc.close();
    }
}
