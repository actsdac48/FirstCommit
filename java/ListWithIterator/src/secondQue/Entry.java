package secondQue;



public class Entry {

	public static void main(String[] args) {
		LinkedList<String> objLinkedlist = new LinkedList<>();

		
		add(objLinkedlist);
		delete(objLinkedlist);
		display(objLinkedlist);
		
		

	}

	public static void display(LinkedList<String> obj) {
		for(String data: obj) {
			System.out.println(data);
		}
	}
	
	public static void add(LinkedList<String> obj) {
		obj.add("First");
		obj.add("Second");
		obj.add("Third");
		obj.add("Forth");
	}
	
	public static void delete(LinkedList<String> obj) {
		obj.delete(3);
	}


}
