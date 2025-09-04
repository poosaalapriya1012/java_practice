import java.util.Scanner;

public class FindMaxMinArray{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of elements:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int sume=0,sumo=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]%2==0) {
                sume=sume+arr[i];
               
            }
            else {
                sumo=sumo+arr[i];
              
            }
        }

        System.out.println("The maximum element is: " + max);
        System.out.println("The minimum element is: " + min);
        System.out.println("sum of even" +sume);

        scanner.close();
    }
}
