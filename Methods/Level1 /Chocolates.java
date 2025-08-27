import java.util.Scanner;

public class Chocolates {
    public static int[] distributeChocolates(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = distributeChocolates(chocolates, children);
        System.out.println("Each child gets " + result[0] + " chocolates, Remaining: " + result[1]);
    }
}
