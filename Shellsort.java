package arrays;

public class Shellsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {20, 35, -15, 7, 55, 1, -22};
		
		System.out.println("unsorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int gap=arr.length/2; gap>0; gap=gap/2) {
			
			for(int i=gap; i<arr.length;i++) {
				int temp=arr[i];
				
				int j=i;
				while(j>=gap && arr[j-gap]>temp) {
					arr[j]=arr[j-gap];
					j-=gap;
				}
				arr[j]=temp;
			}
			
		}
		
		System.out.println("sorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
