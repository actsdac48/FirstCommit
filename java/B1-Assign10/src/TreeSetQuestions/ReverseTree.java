package TreeSetQuestions;

import java.util.Iterator;
import java.util.TreeSet;

public class ReverseTree {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();

		tree.add("BMW");
		tree.add("Volvo");
		tree.add("I20");
		tree.add("Ford");

		System.out.println("Original treeSet : " + tree);
		
		System.out.print("Using descendingSet method : ");
		TreeSet<String> descendingSet = (TreeSet<String>) tree.descendingSet();
		System.out.println(descendingSet);
		
		System.out.println("\nUsing descendingIterator() method");
		
		Iterator<String> descendingIter = tree.descendingIterator();
		while(descendingIter.hasNext())
			System.out.println(descendingIter.next());
	}

}
