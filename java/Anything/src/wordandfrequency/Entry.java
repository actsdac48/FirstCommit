package wordandfrequency;

import java.io.IOException;
import java.util.Map;



public class Entry {

	public static void main(String[] args) {
		
		String inputFileName = "input.txt";
		String outputFileName = "output.txt";
		
		TextFileReader reader = new TextFileReader();
		
		try {
			Map<String, Integer> wordCount = reader.readCountWords(inputFileName);
			
			ReportGenerator reportGenerator = new ReportGenerator();
			reportGenerator.generateReports(wordCount, outputFileName);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("-------Successfull..!!---------");

	}
}
