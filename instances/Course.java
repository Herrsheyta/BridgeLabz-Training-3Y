public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + 
duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

