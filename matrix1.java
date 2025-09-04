import java.util.Scanner;

public class matrix1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nTranspose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        int sumOfElements = 0;
        int sumOfLowerTriangle = 0;
        int sumOfUpperTriangle = 0;
        boolean isIdenticalSum = true;
        int rowSum;
        int colSum = 0;
        
        for (int i = 0; i < rows; i++) {
            rowSum = 0;
            for (int j = 0; j < cols; j++) {
                sumOfElements += matrix[i][j];
                if (i >= j) {
                    sumOfLowerTriangle += matrix[i][j];
                }
                if (i <= j) {
                    sumOfUpperTriangle += matrix[i][j];
                }
                rowSum += matrix[i][j];
                if (i < cols) {
                    colSum += matrix[j][i];
                }
            }
            if (i < cols && rowSum != colSum) {
                isIdenticalSum = false;
            }
        }

        System.out.println("\nSum of elements: " + sumOfElements);
        System.out.println("Sum of lower triangle: " + sumOfLowerTriangle);
        System.out.println("Sum of upper triangle: " + sumOfUpperTriangle);
        System.out.println("Row sums and column sums are identical: " + isIdenticalSum);

        boolean isPrime = true;
        if (sumOfElements <= 1) isPrime = false;
        for (int i = 2; i <= Math.sqrt(sumOfElements); i++) {
            if (sumOfElements % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("The sum of elements is a prime number.");
        } else {
            System.out.println("The sum of elements is not a prime number.");
        }

        int originalNum = sumOfElements;
        int tempNum = sumOfElements;
        int armstrongSum = 0;
        int digits = String.valueOf(sumOfElements).length();
        while (tempNum != 0) {
            int digit = tempNum % 10;
            armstrongSum += Math.pow(digit, digits);
            tempNum /= 10;
        }
        if (armstrongSum == originalNum) {
            System.out.println("The sum of elements is an Armstrong number.");
        } else {
            System.out.println("The sum of elements is not an Armstrong number.");
        }
    }
}
