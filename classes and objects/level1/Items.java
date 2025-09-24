public class Items {
    String itemName;
    int quantity;

    Items(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    void showItem() {
        System.out.println("Item: " + itemName + ", Quantity: " + quantity);
    }

    public static void main(String[] args) {
        Items item = new Items("Pen", 10);
        item.showItem();
    }
}
