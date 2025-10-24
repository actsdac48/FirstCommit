package colorsString;

import java.util.ArrayList;
import java.util.Iterator;



public class AddColorPrintColl {

	public static void main(String[] args) {
		//Write a Java program to create a new array list, add some colors (string) and print out the collection.
		
		ArrayList<String> arrayColor = new ArrayList<>();
		
		arrayColor.add("Red");
		arrayColor.add("Pink");
		arrayColor.add("Yellow");
		arrayColor.add("Black");
		arrayColor.add("Purple");
		
		System.out.println(arrayColor);
		
		
		System.out.println("\nUsing for loop : ");
		for(String data : arrayColor) {
			System.out.println(data);
		}
		
		
		System.out.println("\nUsing Iterator : ");
		Iterator<String> iter = arrayColor.iterator();
		
		while(iter.hasNext()) {
			String data = iter.next();
			System.out.println(data);
			if(data == null)
				iter.remove();
		}
		
		System.out.println("\nFinal List : ");
		System.out.println(arrayColor);
	}

}
