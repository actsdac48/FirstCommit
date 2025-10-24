package colorsString;

import java.util.ArrayList;

public class Que1Modify {
	 //Modify the above Java program to insert an element into the array list at the first position
	public static void main(String[] args) {
		ArrayList<String> arrayColor = new ArrayList<>();

		arrayColor.add("Red");
		arrayColor.add("Pink");
		arrayColor.add("Yellow");
		arrayColor.add("Black");
		arrayColor.add("Purple");

		System.out.println(arrayColor);

		arrayColor.add(1, "White");

		System.out.println("\nFinal List : ");
		System.out.println(arrayColor);
	}
}