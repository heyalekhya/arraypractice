package arrays;

public class Quicksort {

	public static void main(String[] args) {
		int [] arr= {20, 35, -15, 7, 55, 1, -22};
		
		System.out.println("unsorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		quicksort(arr, 0, arr.length);
		
		
		System.out.println("sorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		

	}
	public static void quicksort(int [] input,int start, int end) {
		if(end-start<2) {
			return;
		}
		int pivotindex=partition(input, start, end);
		quicksort(input, start, pivotindex);
		quicksort(input, pivotindex+1, end);
	}
	public static int partition(int [] input, int start, int end) {
		int pivot=input[start];
		int i=start;
		int j=end;
		while(i<j) {
			//empty loop 
			while(i<j && input[--j]>pivot) ;
			if(i<j) {
				input[i]=input[j];
			}
			
			//empty loop
			while(i<j && input[++i]<=pivot);
			if(i<j) {
				input[j]=input[i];
			}
		}
		input[j]=pivot;
		return j;
	}
}
