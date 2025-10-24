package Other;

import java.util.Arrays;

public class FindArrElementByIndex {

	public static void main(String[] args) {
		int [] arr = {1, 2, 4, 5, 6};
		System.out.println("Your original Array is : " + Arrays.toString(arr));
		
		System.out.print("Enter the number from array to find its index : ");
		int num = GetInput.getInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				System.out.println(num + " is at index " + i);
			}
			
		}

	}

}
