package interface_;

public class Entry {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		
		insert(list);
		delete(list);
		display(list);
		

	}

	public static void display(TraverseList<?> obj) {
		String data = (String) obj.getFirst();

		while (data != null) {
			System.out.println(data.toString());
			data = (String) obj.getNext();
		}
	}
	
	public static void insert(List<String> obj) {
		obj.add("First");
		obj.add("Second");
		obj.add("Third");
		obj.add("Forth");
	}
	
	public static void delete(List<String> obj) {
		obj.delete(3);
	}


}
