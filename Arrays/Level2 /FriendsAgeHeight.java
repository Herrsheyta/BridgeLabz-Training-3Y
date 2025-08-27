import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " in cm: ");
            height[i] = sc.nextInt();
        }

        int minAge = age[0], youngestIndex = 0;
        int maxHeight = height[0], tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
                youngestIndex = i;
            }
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                tallestIndex = i;
            }
        }

        System.out.println("Youngest is " + names[youngestIndex] + " with age " + minAge);
        System.out.println("Tallest is " + names[tallestIndex] + " with height " + maxHeight);
    }
}
