public class pow(x,n)_recursive{
    public static int findpower(int x,int n){
        if(n==0){
            return 1;

        }
        return x*findpower(x,n-1);
    }
    public static void main(String args[]){
        System.out.println(findpower(2,10));
    }
}
