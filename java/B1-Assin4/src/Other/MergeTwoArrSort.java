package Other;

import java.util.Arrays;

public class MergeTwoArrSort {

	public static void main(String[] args) {
		
		ArraySort ob = new ArraySort();
		
		int [] array1 = {1, 2, 3, 4};
		int [] array2 = {2, 5, 7, 8};
		
		int[] mergeArr = new int[array1.length + array2.length];

		System.arraycopy(array1, 0, mergeArr, 0, array1.length);
		System.arraycopy(array2, 0, mergeArr, array1.length, array2.length);
		
		int[] arr1 = ob.ascending(mergeArr,mergeArr.length);
		System.out.println("Result : " + Arrays.toString(arr1));
	}

}
