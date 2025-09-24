public class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void display() {
        System.out.println("Product: " + productName + ", Price: " + price + ", 
Quantity: " + quantity + ", Total: " + getTotalCost());
    }
}

