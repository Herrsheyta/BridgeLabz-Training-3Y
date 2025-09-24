public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000.0;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) 
{
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + 
carModel + ", Days: " + rentalDays + ", Total Cost: " + 
calculateTotalCost());
    }
}
