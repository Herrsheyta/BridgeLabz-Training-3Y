public class Table6to9 {
    public static void main(String[] args) {
        int[][] results = new int[4][10];

        for (int num = 6; num <= 9; num++) {
            System.out.println("\nTable of " + num + ":");
            for (int i = 1; i <= 10; i++) {
                results[num-6][i-1] = num * i;
                System.out.println(num + " * " + i + " = " + results[num-6][i-1]);
            }
        }
    }
}
