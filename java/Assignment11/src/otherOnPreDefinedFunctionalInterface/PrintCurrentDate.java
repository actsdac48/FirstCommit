package otherOnPreDefinedFunctionalInterface;

import java.util.function.Supplier;
import java.time.LocalDateTime;

public class PrintCurrentDate {

	public static void main(String[] args) {
		
		Supplier<LocalDateTime> num = () -> LocalDateTime.now();
		
		LocalDateTime currentDate = num.get();
		
		System.out.println(currentDate);

	}

}