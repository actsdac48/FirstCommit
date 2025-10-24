package wordandfrequency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TextFileReader {
	
	public Map<String, Integer> readCountWords(String fileName) throws IOException{
		
		Map<String, Integer> wordCount = new HashMap<>();
		
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line;
			while((line = reader.readLine()) != null) {
				String [] words = line.split("[^a-zA-Z]+");
				
				for(String word : words) {
					if(!word.isEmpty()) {
						Integer count = wordCount.get(word);
						if(count == null) {
							wordCount.put(word,  1);
						}
						else
							wordCount.put(word,  count +1 );
					}
				}
			}
			reader.close();
			return wordCount;
		}
	
	
		/*
		 * private void processLine(String line, Map<String, Integer> wordCount) {
		 * String words [] = line.split("[\\s\\p{Punct}]+");
		 * 
		 * for(String word : words) { if(!word.isEmpty()) { wordCount.put(word,
		 * wordCount.getOrDefault(words, 0) + 1); } } }
		 */
}
