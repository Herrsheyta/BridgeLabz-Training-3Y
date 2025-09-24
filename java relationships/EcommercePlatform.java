import java.util.*;

class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    List<Product> products = new ArrayList<>();
    void addProduct(Product p) {
        products.add(p);
    }
    double total() {
        double sum = 0;
        for (Product p : products) sum += p.price;
        return sum;
    }
}

class CustomerEcom {
    String name;
    CustomerEcom(String name) {
        this.name = name;
    }
    void placeOrder(Order o) {
        System.out.println(name + " placed order. Total: " + o.total());
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        CustomerEcom c = new CustomerEcom("Advita");
        Order o = new Order();
        o.addProduct(new Product("Laptop", 60000));
        o.addProduct(new Product("Mouse", 500));
        c.placeOrder(o);
    }
}

