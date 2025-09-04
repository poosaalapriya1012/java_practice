import java.util.*;
public class perfect{
    public static void main(String[] args)  {

        System.out.print("Enter any number: ");  

        Scanner sc=new Scanner(System.in);  
        double n=sc.nextDouble();   
        double sqrt=Math.sqrt(n);
        if(sqrt==Math.floor(sqrt)){
            System.out.println("perfect square true");
        }
        else{
            System.out.println("not perfect quare false");
        }
    }

}
