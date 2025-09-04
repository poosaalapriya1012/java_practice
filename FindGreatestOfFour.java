import java.util.Scanner;

public class FindGreatestOfFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read 4 integers from the user
        System.out.println("Enter 4 integers:");

        // Read four integers
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        // Find the greatest number
        int greatest = num1; // Assume num1 is the greatest initially

        if (num2 > greatest) {
            greatest = num2; // Update if num2 is greater
        }
        if (num3 > greatest) {
            greatest = num3; // Update if num3 is greater
        }
        if (num4 > greatest) {
            greatest = num4; // Update if num4 is greater
        }

        // Print the greatest number
        System.out.println("The greatest number is: " + greatest);

        // Close the scanner
        scanner.close();
    }
}
