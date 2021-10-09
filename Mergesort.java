package arrays;

public class Mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {20, 35, -15, 7, 55, 1, -22};
		
		System.out.println("unsorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		mergesort(arr, 0, arr.length);
		

		
		System.out.println("sorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}


	}
	
	public static void mergesort(int [] a, int start, int end) {
		if(end -start<2) {
			return;
		}
		int mid=(start+end)/2;
		mergesort(a, start, mid);
		mergesort(a, mid, end);
		merge(a, start, mid, end);
	}

	private static void merge(int[] a, int start,int mid, int end) {
		// TODO Auto-generated method stub
		if(a[mid-1]<=a[mid]) {
			return;
		}
		int i=start, j=mid;
		int tempindex=0;
		int [] temp=new int[end-start];
		while(i<mid && j<end) {
			temp[tempindex++]= a[i]<=a[j] ?  a[i++]: a[j++];
		}
		
		System.arraycopy(a, i, a, start+tempindex, mid-i);
		System.arraycopy(temp, 0, a, start, tempindex);
	}

}
