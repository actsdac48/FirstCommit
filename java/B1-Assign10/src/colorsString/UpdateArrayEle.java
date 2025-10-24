package colorsString;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateArrayEle {
	//Modify the above Java program to update specific 
	//array element by given element.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> arrayColor = new ArrayList<>();

		arrayColor.add("Red");
		arrayColor.add("Pink");
		arrayColor.add("Yellow");
		arrayColor.add("Black");
		arrayColor.add("Purple");

		System.out.println(arrayColor);





		try {
			System.out.println("\nEnter the position : ");
			int index = sc.nextInt();
			if(index < 0 || index > arrayColor.size())
				throw new IndexOutOfBoundsException();
			
			//get color
			System.out.println("Enter name of color : ");
			String color = sc.next();
			//update element
			System.out.println("Romoved Color from index " + index + " : " + arrayColor.set(index, color));
			System.out.println(arrayColor);
		} catch (Exception e) {
			System.out.println("You entered wrong input (^.^) come tommorrow....😂🤣");
			e.printStackTrace();
		}
	}
}
