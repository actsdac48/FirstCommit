package org.cdac.utils;

public class LinkedListEntry {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("Hello");
		list.add("Hello1");

		String data = (String) list.getFirst();
		
		list.add("Previous");
		list.add("Start");
		list.add("Next");
		list.add("End");
		
		list.delete(5);
		
		
		while (data != null) {
			System.out.println(data);
			data = (String) list.getNext();
			
		}

	}

}
