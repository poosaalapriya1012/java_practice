import java.util.*;
public class matrix {
    public static void main(String args[]){
    Scanner sc=new Scanner(system.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    System.out.println("Enter elements:");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          arr[i][j]=sc.nextInt();  
        }
    }
    }
}
