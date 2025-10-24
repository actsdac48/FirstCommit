public class SumPrime {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to calculate sum of prime numbers : ");
		int num = 542; //GetInput.getInt();
		int sum = 0;
		
		
		for(int i = 2; i < num; i++) {
			boolean bool = true;
			for(int j = 2; j < i; j++) {
				if(i%j==0) {
					bool=false;
					break;
				}
			}
			if(bool==true) {
				sum = sum + i;
			}
		}
			
		System.out.print(sum);

	}
}