
public class ArrayFirstEqualLast {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the count of an array elements : ");
		int count = GetInput.getInt();
		int arr[] = new int[count];
		System.out.println("Enter the elements of an array : ");
		for(int i = 0; i < count; i++) {
			arr[i] = GetInput.getInt();
		}
		
		int len = arr.length;
		
		System.out.println(len);
		
		if(len >= 2) {
			int start = arr[0], end = arr[len-1];
			if(start==end) {
				System.out.println(true);
			}
			else
				System.out.println(false);
		}
	}

}
