import java.util.*;

class Course {
    String name;
    List<Student> students = new ArrayList<>();
    Course(String name) {
        this.name = name;
    }
    void enroll(Student s) {
        students.add(s);
    }
    void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();
    Student(String name) {
        this.name = name;
    }
    void addCourse(Course c) {
        courses.add(c);
        c.enroll(this);
    }
    void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println(c.name);
        }
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();
    School(String name) {
        this.name = name;
    }
    void addStudent(Student s) {
        students.add(s);
    }
}

public class SchoolAndStudents {
    public static void main(String[] args) {
        School school = new School("DPS");
        Student s1 = new Student("Advita");
        Student s2 = new Student("Riya");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        s1.addCourse(c1);
        s1.addCourse(c2);
        s2.addCourse(c1);
        school.addStudent(s1);
        school.addStudent(s2);
        s1.showCourses();
        c1.showStudents();
    }
}

