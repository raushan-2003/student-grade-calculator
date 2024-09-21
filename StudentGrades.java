import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************   Welcome To Student Grade Calculator   *****************  \n");

        
        int numberOfSubjects;
        while (true) {
            System.out.print("Enter the number of subjects (1-10): ");
            numberOfSubjects = scanner.nextInt();
            if (numberOfSubjects >= 1 && numberOfSubjects <= 10) {
                break;
            } else {
                System.out.println("Please enter a valid number of subjects between 1 and 10.");
            }
        }

        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;


        for (int i = 0; i < numberOfSubjects; i++) {
            while (true) {
                System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
                int mark = scanner.nextInt();
                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    totalMarks += marks[i];
                    break;
                } else {
                    System.out.println("Invalid input. Please enter marks between 0 and 100.");
                }
            }
        }

        double averagePercentage = (double) totalMarks / numberOfSubjects;

        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n*****************   Results   *****************\n");
        System.out.println("Total Marks: " + totalMarks );

        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        
        System.out.println("Grade: " + grade);

        System.out.println("\n***********************************************\n\n");

        scanner.close();
    }
}
