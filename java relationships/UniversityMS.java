import java.util.*;

class CourseUni {
    String name;
    Professor prof;
    List<StudentUni> students = new ArrayList<>();
    CourseUni(String name) {
        this.name = name;
    }
    void assignProfessor(Professor p) {
        this.prof = p;
        System.out.println("Professor " + p.name + " assigned to " + 
name);
    }
    void enroll(StudentUni s) {
        students.add(s);
        System.out.println(s.name + " enrolled in " + name);
    }
}

class StudentUni {
    String name;
    StudentUni(String name) {
        this.name = name;
    }
    void enrollCourse(CourseUni c) {
        c.enroll(this);
    }
}

class Professor {
    String name;
    Professor(String name) {
        this.name = name;
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        StudentUni s1 = new StudentUni("Advita");
        StudentUni s2 = new StudentUni("Riya");
        Professor p1 = new Professor("Prof. A");
        CourseUni c1 = new CourseUni("Cloud");
        c1.assignProfessor(p1);
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
    }
}

