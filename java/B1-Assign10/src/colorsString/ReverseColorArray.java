package colorsString;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseColorArray {

	public static void main(String[] args) {
		ArrayList<String> arrayColor = new ArrayList<>();

		arrayColor.add("Red");
		arrayColor.add("Pink");
		arrayColor.add("Yellow");
		arrayColor.add("Black");
		arrayColor.add("Purple");

		System.out.println("Original array : " + arrayColor);
		
		Collections.reverse(arrayColor);
		
		System.out.println("\nArray after reverse : " + arrayColor);

	}

}
