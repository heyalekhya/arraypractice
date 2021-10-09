package arrays;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {20, 35, -15, 7, 55, 1, -22};
		System.out.println("unsorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=arr.length-1;i>0;i--) {
			int large=0;
			for(int j=1;j<=arr.length;j++){
				if(arr[j]>arr[large]) {
					large=j;
				}
			}
			swap(arr, large, i);
		}
		
		System.out.println("sorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void swap(int arr[], int i, int j) {
		if(i==j) {
			return;
		}
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
