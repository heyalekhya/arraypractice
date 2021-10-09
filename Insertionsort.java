package arrays;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {20, 35, -15, 7, 55, 1, -22};
		
		System.out.println("unsorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		
		for(int i=1;i<arr.length;i++) {
			int temp= arr[i];
			int j;
			for(j=i; j>0&& arr[j-1]>temp;j--) {
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}
		
		
		System.out.println("sorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}


	}

}
