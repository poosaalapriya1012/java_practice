import java.util.*;

import java.util.Scanner;

public class gof4{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Four Numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		if(a>b && a>c && a>d) {
			System.out.println(a+" is a greatest values");
		}
		else if(b>c && b>d) {
			System.out.println(b+" is a greatest values");
		}
		else if(c>d) {
			System.out.println(c+" is a greatest values");
		}
		else {
			System.out.println(d+" is a greatest values");
		}
	}
}