import java.util.ArrayList;
import java.util.List;

class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    private String studentName;
    private List<Subject> subjects;

    public Student(String studentName) {
        this.studentName = studentName;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getStudentName() {
        return studentName;
    }
}

class GradeCalculator {
    public static String calculateGrade(Student student) {
        int totalMarks = 0;
        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.getMarks();
        }
        double avg = (double) totalMarks / student.getSubjects().size();
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "F";
    }
}

public class SchoolResultsApp {
    public static void main(String[] args) {
        Student s1 = new Student("John");
        s1.addSubject(new Subject("Maths", 90));
        s1.addSubject(new Subject("Science", 85));

        String grade = GradeCalculator.calculateGrade(s1);
        System.out.println("Student: " + s1.getStudentName());
        for (Subject sub : s1.getSubjects()) {
            System.out.println(sub.getName() + ": " + sub.getMarks());
        }
        System.out.println("Final Grade: " + grade);
    }
}

