package otherOnPreDefinedFunctionalInterface;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringArray {

	public static void main(String[] args) {
		
		String [] wordList = {"dog", "Apple", "cat", "banana"};

		
		//Natural sorting property of Arrays
		Arrays.sort(wordList, Comparator.naturalOrder());
		System.out.println(Arrays.toString(wordList));
		
		
		
		//Using lambda
		Arrays.sort(wordList, (s1, s2) -> s1.compareTo(s2));
		System.out.println(Arrays.toString(wordList));
	}

}