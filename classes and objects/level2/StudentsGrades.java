public class StudentsGrades {
    String name;
    int marks;

    StudentsGrades(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void grade() {
        if (marks >= 90)
            System.out.println(name + " got A");
        else if (marks >= 75)
            System.out.println(name + " got B");
        else if (marks >= 50)
            System.out.println(name + " got C");
        else
            System.out.println(name + " got F");
    }

    public static void main(String[] args) {
        StudentsGrades s1 = new StudentsGrades("Advita", 82);
        s1.grade();
    }
}
