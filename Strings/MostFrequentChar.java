import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // HashMap to store character frequencies
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            // Count only letters (optional: remove this if you want to count spaces/symbols too)
            if (Character.isLetter(ch)) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Find most frequent character
        char mostFrequent = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        if (maxCount > 0) {
            System.out.println("Most Frequent Character: '" + mostFrequent + "'");
            System.out.println("Frequency: " + maxCount);
        } else {
            System.out.println("No characters found in input.");
        }

        scanner.close();
    }
}
