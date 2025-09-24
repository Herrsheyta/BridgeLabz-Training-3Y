nano static/Library.java
nano static/Company.java
nano static/Product.java
nano static/Student.java
nano static/Vehicle.java
nano static/Patient.java
public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance");
    }

    public void display() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", 
Balance: " + balance);
    }
}

