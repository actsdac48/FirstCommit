public class SimplePermutation {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
		int size = 4;
		int count =  0;
		for(int i = 0; i < size; i++) {      //1
			for(int j = 0; j < size; j++) {    //
				for(int k = 0; k < size; k++) {
					if(i != j && j != k && i != k) {
						System.out.println(arr[i]+" "+ arr[j] +" "+arr[k]);
						count++;
					}
				}
				
			}
		
		}
		System.out.println("Total number of the three-digit-number is : " + count);
		

	}

}