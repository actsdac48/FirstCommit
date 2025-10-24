package Other;

public class SwapFirstLastEle {

	public static void main(String[] args) {
		int arr[] = {20, 30, 40};

		int sz = arr.length;
		
		if(sz > 1) {
			System.out.print("Original array : ");

			for(int i = 0; i < sz; i++) {
				System.out.print(arr[i] + " ");
			}

			System.out.println();

			int arr1[] = arr;

			
			int temp = arr1[0];
			arr1[0] = arr1[sz-1];
			arr1[sz-1] = temp;


			System.out.print("New array after swapping the first and last elements : ");

			for(int i = 0; i < sz; i++) {
				System.out.print(arr1[i] + " ");
			}
		
		}

	}

}
