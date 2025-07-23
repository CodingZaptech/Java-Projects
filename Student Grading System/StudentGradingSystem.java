import java.util.Scanner;

// Student class for holding student details and computing grade
class Student {
    private String name;
    private int score;
    private char grade;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        this.grade = calculateGrade(score);
    }

    private char calculateGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public char getGrade() {
        return grade;
    }
}

// Main class for managing the grading system
public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask how many students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        Student[] students = new Student[numberOfStudents];

        // Input student name and score
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student marks (out of 100): ");
            int score = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            students[i] = new Student(name, score);
        }

        scanner.close();

        // Display student results
        System.out.println("\n===== Student Grades =====");
        for (Student student : students) {
            System.out.println(student.getName() + " scored " + student.getScore() + " → Grade: " + student.getGrade());
        }
    }
}
