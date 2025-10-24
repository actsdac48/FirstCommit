package StringMani;

public class GetCharAtIndex {

	public static void main(String[] args) {
		String string = "Java Exercise!";
		int num;
		
		do {
		System.out.println("\nEnter the index which you want look : ");
		num = GetInput.getInt();
		
		System.out.println("The character at position " + num + " is " + string.charAt(num));
		
		}while(num < 15);

	}

}
