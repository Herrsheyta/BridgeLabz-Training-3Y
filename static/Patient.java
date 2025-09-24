public class Patient {
    private String name;
    private int age;
    private String disease;

    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public void display() {
        System.out.println("Patient: " + name + ", Age: " + age + ", Disease: " + 
disease);
    }
}

