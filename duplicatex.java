import java.util.*;
public class duplicatex {
  public static void main(String args[]){
    int nums[]={1,2,2,4};
            HashSet<Integer> h = new HashSet<>();
            int duplicate = -1;
    
            for (int i = 0; i < nums.length; i++) {
                int n = nums[i];
                if (!h.contains(n)) 
                {
                    h.add(n);
                } else 
                {
                    duplicate=n;
                }
               
            }
            int missing=0;
            for(int j=1;j<=nums.length;j++){
                if(!h.contains(j)){
                    missing =j;
                }
            }
            int ans[] = { duplicate, missing };
            System.out.println(ans[0]+  " " +ans[1]);
        
        }
    }
    
