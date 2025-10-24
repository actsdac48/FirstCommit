package colorsString;

import java.util.ArrayList;
import java.util.Scanner;

public class SortColorArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> arrayColor = new ArrayList<>();

		arrayColor.add("Red");
		arrayColor.add("Pink");
		arrayColor.add("Yellow");
		arrayColor.add("Black");
		arrayColor.add("Purple");

		System.out.println("Original array : " + arrayColor);
		
		arrayColor.sort(null);
		
		System.out.println("Sorted array : " + arrayColor);
	}
}
