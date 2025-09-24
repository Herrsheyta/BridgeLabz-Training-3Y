public class BankAccount {
    String holder;
    double balance;

    BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println(holder + "'s Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Advita", 10000);
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.display();
    }
}
