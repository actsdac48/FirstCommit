package interface_;

public class LinkedList<T> implements List<T>{
	Node<T> start;
	Node<T> end;
	Node<T> current;
	int maxCount;
	
	@Override
	public void add(T data){
		Node<T> temp= new Node<T>(data);
		
		if(start == null ) {
			start=end=current=temp;
		}else {
			end.next=temp;
			temp.previous=end;
			end=temp;
		}
		maxCount++;
	}
	@Override 
	public void delete(int index){
		if(start==null|| index> maxCount-1) {
			return;
		}
		if(start==end) {
			start=end=current=null;
		}
		else if(index==0) {
			start=start.next;
			start.previous=null;
		}
		else if(index==maxCount-1) {
			end=end.previous;
			end.next=null;
		}
		else {
			Node<T> temp=start;
			
			for(int i=0; i<index;i++,temp=temp.next) {
				temp.previous.next=temp.next;
				temp.next.previous=temp.previous;
			}
			current=start;
			maxCount--; 
		}
	}
	@Override
	public T getFirst() {
		if(start==null)
			return null;
		current =start;
		return current.data;
	}
	@Override
	public T getLast() {
		if(start==null)
			return null;
		current =end;
		return current.data;
	}
	@Override
	public T getNext() {
		if(start==null||current.next==null)
			return null;
		current =current.next;
		return current.data;
	}
	@Override
	public T getPrevious() {
		if(start==null||current.previous==null)
			return null;
		current =current.previous;
		return current.data;
	}
	
	public int getMaxCount() {
		return maxCount;
	}
}