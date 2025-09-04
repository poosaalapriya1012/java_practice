import java.util.*;

public class arrayminmax{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter size of array: ");
		int size = sc.nextInt();
		System.out.println("e1nter elements into array:");
		int a[] = new int[size];
		int i;
		for(i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++) {
			System.out.println(a[i]);
		}

		int max=a[0],min=a[0];
		for(i=0;i<size;i++) {

			if(max<a[i]) {
				max=a[i];
			}
			if(min>a[i]) {
				min=a[i];
			}
		}
		int osum=0,esum=0; 

		for(i=0;i<size;i++) {
			if(a[i]%2==0)
			{
				esum=esum+a[i];
			}
			else if(a[i]%2!=0)
			{
				osum=osum+a[i];;
			}
		}
		System.out.println("Max of array " +max); 
		System.out.println("Min of array " +min);
		System.out.println("Sum of Even Number is: "+esum);
		System.out.println("Sum of Odd NUmbers is: "+osum);


	}
}