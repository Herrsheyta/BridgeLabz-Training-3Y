import java.util.Scanner;

public class Quadratic {
    public static double[] findRoots(int a, int b, int c) {
        int delta = (b * b) - (4 * a * c);
        if (delta < 0) return new double[]{};

        if (delta == 0) return new double[]{ -b / (2.0 * a) };

        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) System.out.println("No Real Roots");
        else {
            for (double r : roots) System.out.println("Root: " + r);
        }
    }
}
