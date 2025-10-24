package Other;

import java.util.Arrays;

public class OccurenceOfNumArray {

	public static void main(String[] args) {
		int [] Array = {10, 99, 34, 78, 99, 21, 34, 56, 34, 78};
		System.out.println("Your original Array is : " + Arrays.toString(Array));
		
		for(int i = 0; i < Array.length; i++) {
			int count = 0;
			int num = Array[i];
			for(int j = i; j < Array.length; j++) {
				if(Array[i] == Array[j]) {
					count++;
				}
			}
			System.out.println(num + " appears " + count + " times.....");
		}
	}

}
