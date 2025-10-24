public class NumAdditiion {

	public static void main(String[] args) {
		
		System.out.print("Enter the number of integer values you wish to add : ");
		int size = GetInput.getInt();
		int sum = 0;
		for(int i = 0; i < size; i++) {
			System.out.print("Enter the value : ");
			int val = GetInput.getInt();
			sum = sum + val;
		}
		System.out.println("Total of the above values : " + sum);
	}
}