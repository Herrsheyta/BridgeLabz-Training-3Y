import java.util.*;

class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
}

class DepartmentUni {
    String name;
    DepartmentUni(String name) {
        this.name = name;
    }
}

class University {
    String name;
    List<DepartmentUni> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();
    University(String name) {
        this.name = name;
    }
    void addDepartment(DepartmentUni d) {
        departments.add(d);
    }
    void addFaculty(Faculty f) {
        faculties.add(f);
    }
    void showUniversity() {
        System.out.println("University: " + name);
        for (DepartmentUni d : departments) {
            System.out.println("Dept: " + d.name);
        }
        for (Faculty f : faculties) {
            System.out.println("Faculty: " + f.name);
        }
    }
}

public class UniversityFaculties {
    public static void main(String[] args) {
        University u = new University("GLA");
        u.addDepartment(new DepartmentUni("CSE"));
        u.addDepartment(new DepartmentUni("ECE"));
        u.addFaculty(new Faculty("Prof. A"));
        u.addFaculty(new Faculty("Prof. B"));
        u.showUniversity();
    }
}

