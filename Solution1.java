package arrays;
import java.util.Scanner;
public class Solution1 {
	 public static int[] getConcatenation(int[] nums) {
	        int n=nums.length;
	        int[] ans=new int[2*n];
	        int i=0;
	        int j=n;
	        while(i < n){
	            ans[i] = nums[i];
	            ans[j] = nums[i]; 
	            i++;
	            j++;
	        }
	        System.out.println(ans);
	        return ans;
	    } 
	public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[] nums=new int[n];
	        for(int i=0;i<n;i++){
	            nums[i]=sc.nextInt();
	        }
	        getConcatenation(nums);
	    }
	}

