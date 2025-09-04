import java.util.*;
public class mergesorting {
    public static void main(String args[]){
        int arr[]={1,2,6,9,4,5};
        int n=arr.length-1;
        merge(arr,0,n);
    }
    public static void mergesort(int arr[],int l,int h){
        int mid;
       
     if(l<h){}
        mid=(l+h)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,h);
        merge(arr,l,mid,h);
    }

    public static void merge(int arr[],int l,int mid,int h){
        int i,j,k;
        int temp[];
        while(i<=mid && j<=h){
            if(a[i]<a[j])
            {
            temp[k]=a[i];
            i++;
            k++;}
            else{
                   
                    temp[k]=a[j];
                    j++;
                    k++;
            }
            

    

    }
}
}
