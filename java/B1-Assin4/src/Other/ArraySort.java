package Other;

public class ArraySort {

	public int[] ascending(int arr[],int sz) {
		
		for(int i = 0; i < sz-1; i++) {
			for(int j = 0; j < sz-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	public int[] descending(int arr[],int sz) {
		
		for(int i = 0; i < sz-1; i++) {
			for(int j = 0; j < sz-1-i; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	

}
