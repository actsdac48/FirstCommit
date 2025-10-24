package StringMani;

public class GetIndexChars {

	public static void main(String[] args) {
		
		char cArray [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		String string =  "The quick brown fox jumps over the lazy dog";
		  
		String string1 = string.toLowerCase();
		
		
		
		
		for(int i = 0; i < string.length(); i++) {
			System.out.println(cArray[i] + " = " + string.indexOf(cArray[i]));
		}
		
		
		
		
		/*
		 * for(int i = 0; i < cArray.length; i++) {
		 
			int ch = cArray[i]-97;
			if(ch<0)
				System.out.print("    ");
			else
				System.out.print(iArray[ch]+" ");
		}
		*/
		
		
		
	}

}
