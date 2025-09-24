public class Student {
    private String name;
    private int rollNumber;
    private double gpa;

    public Student(String name, int rollNumber, double gpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll: " + rollNumber + ", GPA: " + 
gpa);
    }
}

