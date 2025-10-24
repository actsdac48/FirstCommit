package MemberClassFolder;

import java.io.Console;

public class Entry {

	public static void main(String[] args) {
		
		Member ob1 = new Member();
		Console console = System.console();
		
		System.out.println("Enter details of Member : ");
		
		System.out.print("Name : ");
		ob1.setName(console.readLine());
		
		
		Integer.parseInt(console.readLine());
		

	}

}
