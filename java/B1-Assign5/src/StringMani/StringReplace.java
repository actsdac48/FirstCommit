package StringMani;

public class StringReplace {

	public static void main(String[] args) {
		
		String string = "The quick brown fox jumps over the lazy dog.";

		String string1 = string.replaceAll("fox", "cat");
		
		System.out.println("Original stirng : " + string);
		System.out.println("New string : " + string1);
	}

}
