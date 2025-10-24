package TreeSetQuestions;

import java.util.Scanner;
import java.util.TreeSet;

public class GetEleGreaterEqual {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> tree = new TreeSet<>();

		tree.add(45);
		tree.add(34);
		tree.add(67);
		tree.add(12);

		System.out.println("Original treeSet : " + tree);

		System.out.println("Enter element to get greater than or equal to element : ");
		int num = sc.nextInt();
		
		for(int num1 : tree) {
			if(num1 >= num)
				System.out.println(num1);
		}
		
	}

}
