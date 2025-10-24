package colorsString;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchEleArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> arrayColor = new ArrayList<>();

		arrayColor.add("Red");
		arrayColor.add("Pink");
		arrayColor.add("Yellow");
		arrayColor.add("Black");
		arrayColor.add("Purple");

		System.out.println("Original array : " + arrayColor);
		
		System.out.println("Enter the color you want to search : ");
		String color = sc.next();
		
		
		
		
		boolean res = arrayColor.contains(color);

		if(res) {
			int index = arrayColor.indexOf(color);
			System.out.println(color + " is found at index " + index);
		}
		else
			System.out.println("Element not found");
	}
}
