package arrays;
import java.util.Scanner;
import java.util.*;
public class BinaryReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder s=new StringBuilder();
		int n=sc.nextInt();
		String s1=Integer.toBinaryString(n);
		s.append(s1);
		s.reverse();
		System.out.println(s);

	}

}
