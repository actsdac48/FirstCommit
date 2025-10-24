package exceptionhandle;

import java.io.IOException;
import java.sql.SQLException;

public class Entry {

	public static void main(String[] args) {
		
		int age = 18;
		int experience = 7;
		int num = 10;
		
		System.out.println("Statement no 1 : main");
		
		try {
			System.out.println("Statement no. 2 : try");
			
			if(age < 18 || age > 60)
				throw new IOException();
			
			if(experience > 20)
				throw new SQLException();
			
			System.out.println("Statement no. 4 : try");
			
//			if(age == 18)
//				throw new NullPointerException("Null Value");
			
			int ans = num/0;
			System.out.println(num);
			
			int arr [] = {1, 2, 3, 4, 5};
			System.out.println(arr[6]);
			
		}
		catch(SQLException | IOException sqlException) {
			System.out.println("Statement no 5a - catch ");
		}
		catch(ArithmeticException exc) {
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException AIOBE) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	
		finally {
			System.out.println("Finally fired");
		}
		System.out.println("Statement no 6 : main");
	}

}