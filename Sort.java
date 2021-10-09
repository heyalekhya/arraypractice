package arrays;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int [] arr= {20, 35, -15, 7, 55, 1, -22};
		
		System.out.println("unsorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		Arrays.sort(arr);
		
		System.out.println("sorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
