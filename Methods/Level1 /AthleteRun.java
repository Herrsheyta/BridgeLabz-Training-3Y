import java.util.Scanner;

public class AthleteRun {
    public static double calculateRounds(int a, int b, int c) {
        int perimeter = a + b + c;
        double distance = 5000; // 5 km = 5000 meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        int a = sc.nextInt();
        System.out.print("Enter side2: ");
        int b = sc.nextInt();
        System.out.print("Enter side3: ");
        int c = sc.nextInt();

        double rounds = calculateRounds(a, b, c);
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds.");
    }
}
