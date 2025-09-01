public class SalesDashboard {
    public static void main(String[] args) {
        int[] sales = {1200, 1500, 0, 1800, 2100, 1700, 0, 2000, 1900, 1600}; // Example sales data for 10 days

        int totalSales = 0;
        int maxSales = sales[0];
        int maxDay = 1;
        boolean hadHoliday = false;

        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i];
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxDay = i + 1; // Days are 1-indexed
            }
            if (sales[i] == 0) {
                hadHoliday = true;
            }
        }

        System.out.println("Total Sales for 10 days: ₹" + totalSales);
        System.out.println("Day with Maximum Sales: Day " + maxDay + " (₹" + maxSales + ")");
        if (hadHoliday) {
            System.out.println("There was at least one holiday (zero sales).");
        } else {
            System.out.println("No holidays (zero sales) in the period.");
        }
    }
}   