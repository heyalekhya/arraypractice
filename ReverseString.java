package arrays;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder s=new StringBuilder();
		String s1=sc.next();
		String [] n=s1.split(" ");
		for(int i=0;i< n.length;i++) {
			if(n[i].length()>3) {
				System.out.println(n[0]+n[i-1].reverse());
			}
		}
	}

}
