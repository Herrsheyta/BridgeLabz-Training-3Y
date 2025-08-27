import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input dimensions
        System.out.print("Enter number of rows for first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns for first matrix: ");
        int c1 = sc.nextInt();

        System.out.print("Enter number of rows for second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns for second matrix: ");
        int c2 = sc.nextInt();

        // Matrix multiplication condition
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible (c1 != r2).");
            return;
        }

        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];
        int[][] result = new int[r1][c2];

        // Step 2: Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Step 3: Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Step 4: Multiply matrices
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Step 5: Print result
        System.out.println("Resultant Matrix after Multiplication:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
