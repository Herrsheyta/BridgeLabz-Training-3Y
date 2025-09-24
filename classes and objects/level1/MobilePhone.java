public class MobilePhone {
    String brand;
    int price;

    MobilePhone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Apple", 90000);
        phone.showDetails();
    }
}
