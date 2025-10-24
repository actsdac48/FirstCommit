package wordandfrequency;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class WordfrequencyAnalyzer {
	public List<String> sortAlphabetically(Map<String, Integer> wordCount)
	{
		List<String> words = new ArrayList<>(wordCount.keySet());
		Collections.sort(words);
		return words;
	}
	
	
	public List<String> sortByFrequency(Map<String, Integer> wordCount)
	{
		
		List<String> words = new ArrayList<String>(wordCount.keySet());
		
		Collections.sort(words, new Comparator<String>()
		{
			public int compare(String word1, String word2) {
				int count1 = wordCount.get(word1);
				int count2 = wordCount.get(word2);
				
				if(count1 != count2) {
					return count2 - count1;
				}
				
				return word1.compareTo(word2);
			}
		});
		
		return words;

		
	}
}