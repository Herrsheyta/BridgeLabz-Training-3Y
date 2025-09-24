public class Company {
    private String employeeName;
    private String department;
    private double salary;

    public Company(String employeeName, String department, double salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee: " + employeeName + ", Dept: " + department + ", 
Salary: " + salary);
    }
}

