package colorsString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CopyColorArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> arrayColor = new ArrayList<>();

		arrayColor.add("Red");
		arrayColor.add("Pink");
		arrayColor.add("Yellow");
		arrayColor.add("Black");
		arrayColor.add("Purple");

		System.out.println("Original array : " + arrayColor);
		
		ArrayList<String> arrayColorCopy = new ArrayList<>();
		
		
		System.out.println("\nUsing Append method----");
		arrayColorCopy.addAll(arrayColor);
		System.out.println("Copied array : " + arrayColorCopy);
		
		System.out.println("\nUsing Collenction method----");
		Collections.copy(arrayColorCopy, arrayColor);
		System.out.println("Copied array : " + arrayColorCopy);
		
	}
}
