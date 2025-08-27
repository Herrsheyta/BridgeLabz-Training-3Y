import java.util.Scanner;

public class StudentGrades {
    
    // Function to calculate grade based on percentage
    public static String calculateGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Arrays to store marks, percentage, and grade
        int[][] marks = new int[n][3]; // [student][3 subjects]
        double[] percentages = new double[n];
        String[] grades = new String[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks of student " + (i + 1) + " (Physics, Chemistry, Maths):");

            System.out.print("Physics: ");
            int phy = sc.nextInt();

            System.out.print("Chemistry: ");
            int chem = sc.nextInt();

            System.out.print("Maths: ");
            int math = sc.nextInt();

            // Check for negative marks
            if (phy < 0 || chem < 0 || math < 0) {
                System.out.println("❌ Marks cannot be negative. Please re-enter.");
                i--; // retry same student
                continue;
            }

            marks[i][0] = phy;
            marks[i][1] = chem;
            marks[i][2] = math;

            // Calculate percentage
            int total = phy + chem + math;
            double percentage = total / 3.0;
            percentages[i] = percentage;

            // Assign grade
            grades[i] = calculateGrade(percentage);
        }

        // Display result
        System.out.println("\nResults:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f%%\t\t%s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2],
                    percentages[i], grades[i]);
        }

        sc.close();
    }
}
