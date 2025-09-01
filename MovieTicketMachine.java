import java.util.Scanner;

public class MovieTicketMachine {
    public static int getTicketPrice(String category) {
        switch (category.toLowerCase()) {
            case "silver":
                return 150;
            case "gold":
                return 250;
            case "platinum":
                return 400;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter ticket category (Silver/Gold/Platinum) or 'exit' to quit: ");
            String category = scanner.nextLine().trim();

            if (category.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Movie Ticket Machine.");
                break;
            }

            int price = getTicketPrice(category);
            if (price == -1) {
                System.out.println("Invalid category. Please try again.");
                continue;
            }

            System.out.print("Enter number of tickets: ");
            String ticketsInput = scanner.nextLine().trim();
            int numTickets;
            try {
                numTickets = Integer.parseInt(ticketsInput);
                if (numTickets <= 0) {
                    System.out.println("Number of tickets must be positive.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid integer.");
                continue;
            }

            int total = price * numTickets;
            double serviceCharge = total * 0.05;
            double grandTotal = total + serviceCharge;

            System.out.println("Category: " + category.substring(0, 1).toUpperCase() + category.substring(1).toLowerCase());
            System.out.println("Tickets: " + numTickets);
            System.out.println("Subtotal: ₹" + total);
            System.out.printf("Service Charge (5%%): ₹%.2f%n", serviceCharge);
            System.out.printf("Grand Total: ₹%.2f%n%n", grandTotal);
        }

        scanner.close();
    }
}