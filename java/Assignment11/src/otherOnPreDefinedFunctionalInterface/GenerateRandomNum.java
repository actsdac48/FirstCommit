package otherOnPreDefinedFunctionalInterface;

import java.util.function.Supplier;

public class GenerateRandomNum {

	public static void main(String[] args) {
		
		
		//wrong way
		Supplier<Integer> rand = () ->
		{
			int num = (int) (Math.random()*1000);
			
			return num;
		};
		
		System.out.println(rand.get());
		
		
		//right way
		Supplier<String> rand1 = () ->
		{
			String sum = "";
			int idx = 3;
			while(idx > 0) {
				sum += (int)(Math.random() * 9);
				idx--;
			}
			
			return sum;
		};
		System.out.println(rand1.get());
		
		
		

	}

}
