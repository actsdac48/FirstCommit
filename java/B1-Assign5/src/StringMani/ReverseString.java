package StringMani;

public class ReverseString {

	public static void main(String[] args) {
		
		String string = "The quick brown fox jumps";
		System.out.println("The given string is: " + string);
		
		StringBuffer buffer = new StringBuffer(string);
		buffer.reverse();
		System.out.println("The string in reverse order is : " + buffer);
		

	}

}
