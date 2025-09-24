import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double pricePerUnit;
    private double quantity;

    public Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}

class Customer {
    private String customerName;
    private List<Product> products;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Product> getProducts() {
        return products;
    }
}

class BillGenerator {
    public static double generateBill(Customer customer) {
        double total = 0;
        for (Product product : customer.getProducts()) {
            total += product.getTotalPrice();
        }
        return total;
    }
}

public class GroceryStoreApp {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        c1.addProduct(new Product("Apples", 3.0, 2));
        c1.addProduct(new Product("Milk", 2.0, 1));

        double bill = BillGenerator.generateBill(c1);

        System.out.println("Customer: " + c1.getCustomerName());
        for (Product p : c1.getProducts()) {
            System.out.println(p.getName() + " - " + p.getQuantity() + " 
units @ $" + p.getPricePerUnit() + " each");
        }
        System.out.println("Total Bill: $" + bill);
    }
}

