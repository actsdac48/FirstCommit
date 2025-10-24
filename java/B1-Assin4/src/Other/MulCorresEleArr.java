package Other;

public class MulCorresEleArr {

	public static void main(String[] args) {

		int arr1[] = {1, 3, -5, 4};
		int arr2[] = {1, 4, -5, -2};
		int sz = arr1.length;
		
		
		System.out.print("Result : ");
		for(int i = 0; i < sz; i++) {
			System.out.print(arr1[i]*arr2[i] + " ");
		}

	}

}
