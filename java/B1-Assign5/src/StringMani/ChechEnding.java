package StringMani;

public class ChechEnding {

	public static void main(String[] args) {
		String string = "Python Exercise";
		
		boolean result = true;
		
		if(string.endsWith("se"))
			System.out.println(string + " ends with se ? \t" + result);
		else {
			result = false;
			System.out.println(string + " ends with se ? \t" + result);
		}
		
		String string1 = "Python Exercises";
		if(string1.endsWith("se"))
			System.out.println(string1 + " ends with se ? \t" + result);
		else {
			result = false;
			System.out.println(string1 + " ends with se ? \t" + result);
		}
		
	}

}
