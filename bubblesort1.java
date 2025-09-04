public class bubblesort1 {

    public static void bubblesort(int arr[]) {
        int n=arr.length;
        for (int i=0; i <n-1; i++) {
            for (int j=0; j < n-1-i; j++) { 
            if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i=0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {9, 8, 3, 15, 12};
        bubblesort(arr);
    }
}
