package Other;

public class ArrayAscDesc {

	public static void main(String[] args) {
		
		
		ArraySort ob = new ArraySort();
		
		System.out.print("Enter the total numbers you wish to sort : ");
		int sz = GetInput.getInt();
		
		int arr[] = new int[sz];
		
		for(int i = 0; i < sz; i++) {
			System.out.println("Enter the " + i + "th value : ");
			arr[i] = GetInput.getInt();
		}
		
		int choice;
		do {
			
			System.out.println("\n1. Sort in ascending order\n2. Sort in descending order");
			choice = GetInput.getInt();
			
			switch(choice) {
				case 1 : {
					
					System.out.print("Assending array is : ");
					int[] arr1 = ob.ascending(arr,sz);
					
					for(int i = 0; i < sz; i++) {
						System.out.print(arr1[i] + " ");

					}
					
									
				} break;
				
			
				case 2 : {
					
					System.out.print("Descending array is : ");
					int[] arr1 = ob.descending(arr,sz);
					for(int i = 0; i < sz; i++) {
						System.out.print(arr[i] + " ");
						
					}
					
				} break;
				
				default : System.out.println("Wrong input.........!!");
			}
			
			
		}while(choice < 3);
	
	}

}
