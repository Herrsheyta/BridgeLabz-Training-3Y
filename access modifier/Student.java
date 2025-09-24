public class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, 
String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", 
CGPA: " + getCgpa() + ", Specialization: " + specialization);
    }
}

