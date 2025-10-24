package wordandfrequency;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class ReportGenerator {

	private WordfrequencyAnalyzer analyzer;
	
	public ReportGenerator() {
		this.analyzer = new WordfrequencyAnalyzer();
	}
	
	public void generateReports(Map<String, Integer> wordCount, String fileName) throws IOException{

		PrintWriter writer = new PrintWriter(new FileWriter(fileName));

		generateAlphabeticalReport(wordCount, writer);
		writer.println("\n\n");
		generateFrequencyReport(wordCount, writer);
		writer.println("\n\n");
		
		writer.close();
	}
	
	private void generateAlphabeticalReport(Map<String, Integer> wordCount, PrintWriter writer) {
		
		writer.println("Alphabetical Order : ");
		writer.println("-------------------------");
		writer.printf("%-20s %s%n", "word", "count");
		
		List<String> alphabeticalWords = analyzer.sortAlphabetically(wordCount);
		
		for(String word : alphabeticalWords) {
			writer.printf("%-20s %d%n", word, wordCount.get(word));
		}
	}
	
	
	private void generateFrequencyReport(Map<String, Integer> wordCount, PrintWriter writer){
		
		//writer.println("\n*************************");
		writer.println("Sorted by frequency :");
		writer.println("-------------------------");
		writer.printf("%-20s %s%n", "word", "count");
		
		List<String> frequencyWords = analyzer.sortByFrequency(wordCount);
		
		for(String word : frequencyWords) {
			writer.printf("%-20s %d%n", word, wordCount.get(word));
		}
	}
	
	
	/*
	 * private void generateSummaryReport(Map<String, Integer> wordCount,
	 * PrintWriter writer) { writer.println("Summary statistircs");
	 * 
	 * writer.println("") List<Entry<String, Integer>> frequencyList =
	 * analyzer.sortByFrequency(wordCount);
	 * 
	 * for(Entry<String, Integer> entry : frequencyList) {
	 * writer.printf("%-20s %d%n", entry.getKey(), entry.getValue()); } }
	 */
}
