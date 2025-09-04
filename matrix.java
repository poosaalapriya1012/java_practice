import java.util.*;
public class matrix {
    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();

    int arr[][]=new int[r][c];

    System.out.println("Enter elements:");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
          arr[i][j]=sc.nextInt();  
        }
    }
    System.out.println("The array:");
	for(int i=0;i<r;i++)
    {
		for(int j=0;j<c;j++)
        {
			System.out.print(arr[i][j]+" ");
		}
        System.out.println();
	}
    System.out.println("Enter key:");
    int key=sc.nextInt();
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
        if(key==arr[i][j]){
            System.out.println("Element found at ("+i+" "+j+")");
        }
    }
}



    }
}
