import java.util.*;
class goodpairs{
    public static void main(String args[]){
        //number of good pairs
       

      HashMap<Integer,Integer>h=new HashMap<>();

       
        int[] arr={1,2,1,1,1};

        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            h.put(n,h.getOrDefault(n,0)+1);
        }
        int ans=0;
      
        for(int i:h.keySet()){
            int val=i=h.get(i);
            ans=ans+(val*(val-1))/2;
        }
        System.out.println(ans);

        


    }
}