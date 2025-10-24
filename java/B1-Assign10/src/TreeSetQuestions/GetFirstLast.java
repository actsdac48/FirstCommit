package TreeSetQuestions;

import java.util.TreeSet;

public class GetFirstLast {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();

		tree.add("BMW");
		tree.add("Volvo");
		tree.add("I20");
		tree.add("Ford");

		System.out.println("Original treeSet : " + tree);
		
		String first = tree.first();
		System.out.println("\nFirst element : " + first);
		
		String last = tree.last();
		System.out.println("Last element : " + last);

	}

}
