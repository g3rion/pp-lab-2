import java.util.Scanner;

public class SredniaOcen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your grades for the following subjects:");

        // Get the grade for Mathematics
        System.out.print("Mathematics: ");
        double mathGrade = scanner.nextDouble();

        // Get the grade for Physics
        System.out.print("Physics: ");
        double physicsGrade = scanner.nextDouble();

        // Get the grade for Chemistry
        System.out.print("Chemistry: ");
        double chemistryGrade = scanner.nextDouble();

        // Calculate the average
        double average = (mathGrade + physicsGrade + chemistryGrade) / 3;

        // Print the average grade
        System.out.printf("Your average grade is: %.2f\n", average);

        // Close the scanner
        scanner.close();
    }
}