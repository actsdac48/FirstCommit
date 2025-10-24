public class ArrayRotation {
	public static void main(String args []) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70};
		int len = arr.length;
		if(len >= 2) {

			int arr1[] = new int[len];
			int start = arr1[0];
			
			//Original array
			System.out.print("Original array : ");
			for(int i = 0; i < len; i++) {
				System.out.print(arr[i] + " ");
			}
			
			System.out.println();
			
			//Reverse operation
			for(int i = len-1; i >= 0; i--) {
				arr1[start] = arr[i];
				start++;
			
			}
			
			//new array
			System.out.print("Rotated array : ");
			for(int i = 0; i < len; i++) {
				System.out.print(arr1[i] + " ");
			}
		}
	}
}