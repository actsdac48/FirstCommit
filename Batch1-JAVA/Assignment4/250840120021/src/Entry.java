
public class Entry {

	public static void main(String[] args) {
		int choice, ch;
		do {

			System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
			System.out.println("Enter your choice : ");

			ch = GetInput.getInt();



			switch(ch) {
			case 1 : {


				System.out.println("Enter count of numbers (2 or 3): ");

				choice = GetInput.getInt();

				switch(choice) {
				case 2 : {
					System.out.println("Enter two numbers : ");
					int a = GetInput.getInt();
					int b = GetInput.getInt();
					System.out.println("Addition is : " + Calculator.add(a,b));
				}
				break;

				case 3 : {
					System.out.println("Enter three numbers : ");
					int a = GetInput.getInt();
					int b = GetInput.getInt();
					int c = GetInput.getInt();
					System.out.println("Addition is : " + Calculator.add(a,b,c));
				}
				break;

				}
				break;
			}



			//For Substraction
			case 2 : {

				System.out.println("Enter count of numbers (2 or 3): ");

				choice = GetInput.getInt();

				switch(choice) {
				case 2 : {
					System.out.println("Enter two numbers : ");
					int a = GetInput.getInt();
					int b = GetInput.getInt();
					System.out.println("Substraction is : " + Calculator.sub(a,b));


				}
				break;

				case 3 : {
					System.out.println("Enter three numbers : ");
					int a = GetInput.getInt();
					int b = GetInput.getInt();
					int c = GetInput.getInt();
					System.out.println("Substraction is : " + Calculator.sub(a,b,c));
				}
				break;
				}
			break;
			}
			
			
			//for multiplication
			case 3 : {

				System.out.println("Enter count of numbers (2 or 3): ");

				choice = GetInput.getInt();

				switch(choice) {
				case 2 : {
					System.out.println("Enter two numbers : ");
					int a = GetInput.getInt();
					int b = GetInput.getInt();
					System.out.println("Multiplication is : " + Calculator.mul(a,b));


				}
				break;

				case 3 : {
					System.out.println("Enter three numbers : ");
					int a = GetInput.getInt();
					int b = GetInput.getInt();
					int c = GetInput.getInt();
					System.out.println("Multiplication is : " + Calculator.mul(a,b,c));
				}
				break;
				}

			}
			break;
			
			//fro division
			case 4 : {

					System.out.println("Enter two numbers : ");
					int a = GetInput.getInt();
					int b = GetInput.getInt();
					System.out.println("Division is : " + Calculator.div(a,b));
			}
			break;
			
			default : 
				System.out.println("Enter valid choice");			
				break;
			

			}

		}while(ch<5);
	}
}