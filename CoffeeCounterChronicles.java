import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static int getCoffeePrice(String type) {
        switch (type.toLowerCase()) {
            case "espresso":
                return 120;
            case "cappuccino":
                return 150;
            case "latte":
                return 170;
            case "americano":
                return 130;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double GST_RATE = 0.18; // 18% GST

        while (true) {
            System.out.print("Enter coffee type (Espresso/Cappuccino/Latte/Americano) or 'exit' to quit: ");
            String type = scanner.nextLine().trim();

            if (type.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Coffee Counter Chronicles.");
                break;
            }

            int price = getCoffeePrice(type);
            if (price == -1) {
                System.out.println("Invalid coffee type. Please try again.");
                continue;
            }

            System.out.print("Enter quantity: ");
            String qtyInput = scanner.nextLine().trim();
            int quantity;
            try {
                quantity = Integer.parseInt(qtyInput);
                if (quantity <= 0) {
                    System.out.println("Quantity must be positive.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid quantity. Please enter a valid integer.");
                continue;
            }

            int subtotal = price * quantity;
            double gst = subtotal * GST_RATE;
            double total = subtotal + gst;

            System.out.println("Coffee Type: " + type.substring(0, 1).toUpperCase() + type.substring(1).toLowerCase());
            System.out.println("Quantity: " + quantity);
            System.out.println("Subtotal: ₹" + subtotal);
            System.out.printf("GST (18%%): ₹%.2f%n", gst);
            System.out.printf("Total Bill: ₹%.2f%n%n", total);
        }

        scanner.close();
    }
}