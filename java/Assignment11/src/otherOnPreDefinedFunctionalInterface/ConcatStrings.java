package otherOnPreDefinedFunctionalInterface;

import java.util.function.BiConsumer;

public class ConcatStrings {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "World";
		
		 BiConsumer<String, String> equals = (str, str3) ->
		 {
			 System.out.println(str1+str2);
		 };
		 
		 equals.accept(str1,str2);

	}

}
