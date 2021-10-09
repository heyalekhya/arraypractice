package arrays;
import java.util.Scanner;
public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int [] arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int num2=sc.nextInt();
		int s=sc.nextInt();
		int j=0;
		while(j<num) {
			for(int k=0;k<s;k++) {
				if(arr[k]==num2) {
					return 1;
				}
			}
			j++;
		}
		return 0;

	}

}
