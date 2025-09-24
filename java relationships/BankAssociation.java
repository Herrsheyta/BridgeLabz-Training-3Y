import java.util.*;

class Customer {
    String name;
    double balance;
    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    void viewBalance() {
        System.out.println(name + " Balance: " + balance);
    }
}

class Bank {
    String name;
    List<Customer> customers = new ArrayList<>();
    Bank(String name) {
        this.name = name;
    }
    void openAccount(Customer c) {
        customers.add(c);
    }
    void showCustomers() {
        System.out.println("Bank: " + name);
        for (Customer c : customers) {
            System.out.println(c.name);
        }
    }
}

public class BankAndCustomers {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer c1 = new Customer("Advita", 5000);
        Customer c2 = new Customer("Riya", 7000);
        bank.openAccount(c1);
        bank.openAccount(c2);
        bank.showCustomers();
        c1.viewBalance();
        c2.viewBalance();
    }
}

