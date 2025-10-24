package TreeSetQuestions;

import java.util.TreeSet;

public class NewTreeSet {

	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<>();
		
		tree.add("BMW");
		tree.add("Volvo");
		tree.add("I20");
		tree.add("Ford");
		
		System.out.println(tree);
		
		System.out.println("\nUsing for loop : ");
		for(String data : tree)
			System.out.println(data);

		
		
	}

}
