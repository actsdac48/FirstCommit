package Inheritance;

public class Entry {

	public static void main(String[] args) {
		
		Parent obj = new Parent();
		System.out.println("1 -  method of parent class by object of parent class : ");
		obj.printMessageParent();
		
		System.out.println();
		
		Child obj1 = new Child();
		System.out.println("2 - method of child class by object of child class : ");
		obj1.printMessageChild();
		
		System.out.println();
		
		System.out.println("3 - method of parent class by object of child class : ");
		obj1.printMessageParent();

	}

}
