import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        int costPrice = sc.nextInt();

        System.out.print("Enter Selling Price: ");
        int sellingPrice = sc.nextInt();

        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100.0) / costPrice;

        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent
        );
    }
}
