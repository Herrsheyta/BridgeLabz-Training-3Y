public class CartItem {
    String product;
    int quantity;
    double price;

    CartItem(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    double totalPrice() {
        return quantity * price;
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 2, 55000);
        System.out.println("Total Price: " + item.totalPrice());
    }
}
