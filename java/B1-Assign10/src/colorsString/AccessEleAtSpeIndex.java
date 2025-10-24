package colorsString;

import java.util.ArrayList;
import java.util.Scanner;

public class AccessEleAtSpeIndex {
	//Modify the above Java program to retrieve an element 
	//(at a specified index) from a given array list.
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrayColor = new ArrayList<>();

		arrayColor.add("Red");
		arrayColor.add("Pink");
		arrayColor.add("Yellow");
		arrayColor.add("Black");
		arrayColor.add("Purple");

		System.out.println(arrayColor);
		
		System.out.println("\nColor at index 1 : " + arrayColor.get(0));
		System.out.println("Color at index 2 : " + arrayColor.get(1));
		System.out.println("Color at index 3 : " + arrayColor.get(2));
		System.out.println("Color at index 4 : " + arrayColor.get(3));
		System.out.println("Color at index 5 : " + arrayColor.get(4));
		
		
		
		try {
			System.out.println("\nEnter the position : ");
			int index = sc.nextInt();
			if(index < 0 || index > arrayColor.size())
				throw new IndexOutOfBoundsException();
			System.out.println("Color at index " + index + " : " + arrayColor.get(index));
			
		} catch (Exception e) {
			System.out.println("You entered wrong input (^.^) come tommorrow....😂🤣");
			e.printStackTrace();
		}
	}
}
