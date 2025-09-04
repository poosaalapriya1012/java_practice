public class OperatorsDemo {
    public static void main(String[] args) {
   
        int a = 10;
        int b = 2;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); 
        System.out.println("a - b = " + (a - b)); 
        System.out.println("a * b = " + (a * b)); 
        System.out.println("a / b = " + (a / b)); 
        System.out.println("a % b = " + (a % b)); 

        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); 
        System.out.println("a != b: " + (a != b)); 
        System.out.println("a > b: " + (a > b));   
        System.out.println("a < b: " + (a < b));   
        System.out.println("a >= b: " + (a >= b)); 
        System.out.println("a <= b: " + (a <= b)); 

        boolean x = true;
        boolean y = false;
        System.out.println("\nlogical operators:");
        System.out.println("x && y: " + (x && y)); 
        System.out.println("x || y: " + (x || y)); 
        System.out.println("!x: " + (!x));   

     
        int c = 7,d=7;
        c += 3; 
        d-=2;
        System.out.println("\nAssignment Operators:");
        System.out.println("c = " + c); 
        System.out.println("d = " + d); 

      
        System.out.println("\nUnary Operators:");
        System.out.println("++a: " + (++a));
        System.out.println("++a: " + (a++));
        System.out.println("b--: " + (b--)); 
        System.out.println("b after b--: " + b); 
        System.out.println("b after b--: " + a); 

        int m = 12; 
        int n = 5;  
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n = " + (m & n)); 
        System.out.println("m | n = " + (m | n)); 
        System.out.println("m ^ n = " + (m ^ n)); 
        System.out.println("~m = " + (~m));       
      
        System.out.println("\nShift Operators:");
        System.out.println("m << 2 = " + (m << 2)); 
        System.out.println("m >> 2 = " + (m >> 2)); 
        System.out.println("m >>> 2 = " + (m >>> 2));
        //Ternary
        int p=13,q=30;

        int max = ( p> q) ? p : q;
        System.out.println("\nTernary Operator:");
        System.out.println("The maximum of p and q is: " + max);

    }
}
