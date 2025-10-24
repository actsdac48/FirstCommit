package org.cdac.utils;

public class LinkedList<T> {
	
	Node<T> start;
	
	Node<T> end;
	
	Node<T> current;
	
	int maxCount = 0;
	
	//Add new node
	public void add(T data) {
		
		Node<T> tmpNode = new Node<T>(data);
		
		if(start == null)
			start = end = current = tmpNode;
		
		end.next = tmpNode;
		tmpNode.previous = end;
		end = tmpNode;
		
		maxCount++;
		
	}
	
	//get first node data
	public T getFirst() {
		if(start == null) 
			return null;
		
		current = start;
		return current.Data;
		
	}
	
	//get last node data
	public T getLast() {
		if(start == null) 
			return null;
		
		current = end;
		return current.Data;
		
	}
	
	//get data of next node of current node
	public T getNext() {
		if(start == null || current.next == null) 
			return null;
		
		current = current.next;
		return current.Data;
	}
	
	//get data of previous node of current node
	public T getPrevious() {
		if(start == null) 
			return null;
		
		current = current.previous;
		return current.Data;
	}
	
	//delete node
	public void delete(int index) {
		if(start == null)
			return;
		
		if(start == end)
			start = end = current = null;
		else if(index == 0) {
			start = start.next;
			start.previous = null;
		}
		else if(index == maxCount-1) {
			end = end.previous;
			end.next = null;
		}
		else if(index == maxCount - 1)
			end.next = null;
		else {
			Node<T> tmpNode = start;
			
			for(int iTmp = 0; iTmp < index; iTmp++, tmpNode = tmpNode.next);
			
			tmpNode.previous.next = tmpNode.next;
			tmpNode.next.previous = tmpNode.previous;
		}
		
		current = start;
		maxCount--;
	}
	
	public int getMaxCount() {
		return maxCount;
	}
	
}
