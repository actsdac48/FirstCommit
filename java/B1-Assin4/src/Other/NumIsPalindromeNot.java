package Other;

public class NumIsPalindromeNot {
	public static void main (String args []) {
		System.out.println("Input a positive integer : ");
		int num = GetInput.getInt();
		
		int originalnum = num;
		int rev = 0;
		//boolean bool = true;
		
		while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
		
		boolean isPalindrome = (originalnum == rev);
	        
	    System.out.println("Output : " + isPalindrome);
		
		/*
		 * if(originalnum == rev) {
			bool = true;
			System.out.println("Output : " + bool);
		}
		else {
			bool = false;
			System.out.println("Output : " + bool);
		}
		 */
		
	}
}
