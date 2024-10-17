import java.util.Scanner;

public class StipendiumTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfGrades = scanner.nextInt();
        int grade = 0;
        int totalGrades = 0;

        for (int i = 0; i < numberOfGrades; ++i) {
            grade = scanner.nextInt();
            totalGrades += grade;

            if (grade == 3) {
                System.out.println("None");
                scanner.close();
                return;
            }
        }

        double averageGrade = (double) totalGrades / numberOfGrades;

        if (totalGrades == numberOfGrades * 5) {
            System.out.println("Named");
        } else if (averageGrade >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }

        scanner.close();
    }
}
