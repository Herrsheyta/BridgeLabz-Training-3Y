import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words (any whitespace as delimiter)
        String[] words = sentence.split("\\s+");

        String longestWord = "";
        for (String word : words) {
            // Remove punctuation (optional: keeps only letters and digits)
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Output result
        if (!longestWord.isEmpty()) {
            System.out.println("The longest word is: " + longestWord);
            System.out.println("Length: " + longestWord.length());
        } else {
            System.out.println("No valid word found.");
        }

        scanner.close();
    }
}
