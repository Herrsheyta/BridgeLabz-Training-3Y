public class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " 
+ salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Advita", 101, 50000);
        e1.displayDetails();
    }
}
