public class Vehicle {
    private String owner;
    private String model;
    private String registrationNumber;

    public Vehicle(String owner, String model, String registrationNumber) {
        this.owner = owner;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    public void display() {
        System.out.println("Owner: " + owner + ", Model: " + model + ", RegNo: " + 
registrationNumber);
    }
}

