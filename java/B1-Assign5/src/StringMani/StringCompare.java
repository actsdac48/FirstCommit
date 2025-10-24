package StringMani;

public class StringCompare {

	public static void main(String[] args) {
		 String string1 = "This is Exercise 1";
		 String string2 = "This is Exercise 2";
		 
		 
	
		 
		 int num = string1.compareTo(string2);
		 		 
		 if(num > 0)			  
			 System.out.println("This is Exercise 1 is greater than This is Exercise 2");
		else if(num == 0)
			 System.out.println("This is Exercise 1 is equal This is Exercise 2");
		 else
			 System.out.println("This is Exercise 1 is less than This is Exercise 2");
		 
		 /*
		   	if (string1 > string2) it returns a positive value.
			if both the strings are equal lexicographically i.e.(string1 == string2) it returns 0.
			if (string1 < string2) it returns a negative value.

		  */
	}
}
