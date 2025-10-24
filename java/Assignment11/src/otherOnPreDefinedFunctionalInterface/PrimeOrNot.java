package otherOnPreDefinedFunctionalInterface;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a nuymber to check a prime or not : ");
		int num = sc.nextInt();
		
		
		 IntPredicate intPredicate = (x) ->
	        {
	        	if (x <= 1)
	                return false;
	        	
	        	for(int i = 2; i < x; i++)
	        		if (x % i == 0)
		                return false;
	        	
	        	return true;
	        };
		
	        System.out.println(intPredicate.test(num));
	}
}
