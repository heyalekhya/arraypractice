package arrays;
import java.util.*;
public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
		    int[] tmp=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				tmp[i] = a[i];
			}
		    
		    int f=0;
			int A=(new Solution()).peakElement(tmp,n);
			
			if(A<0 && A>=n)
			    System.out.println(0);
			else
			{
    			if(n==1 && A==0)
    			    f=1;
    			else if(A==0 && a[0]>=a[1])
    			    f=1;
    			else if(A==n-1 && a[n-1]>=a[n-2])
    			    f=1;
    			else if(A >= 0 && A < n && a[A] >=a[A+1] && a[A]>= a[A-1])
    			    f=1;
    			else
    			    f=0;
			    System.out.println(f);
			}
		}
	}

	}

class Solution
{
	
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       if(n==0)
       return 0;
       if(arr[0]>arr[1])
       return n-1;
      return peakElementUtil(arr,0,n-1,n);
}
public static int peakElementUtil(int[] arr, int low, int high, int n){
    int mid=(low+high)>>1;
    
    if((mid==0|| arr[mid-1]<=arr[mid])&& (mid==n-1|| arr[mid-1]<=arr[mid+1])){
        return mid;
    }
    if((mid>0&& arr[mid]<arr[mid-1])){
        return peakElementUtil(arr, low, mid-1, n);
    }
    else{
        return peakElementUtil(arr,mid+1,high,n);
    }
}
}
