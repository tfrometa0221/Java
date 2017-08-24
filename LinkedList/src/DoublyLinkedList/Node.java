package DoublyLinkedList;

public class Node {
	private int id = 0;
	private Node next = null;
	private Node last = null;
	
	public Node(int id) {
		this.id = id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNext(Node node) {
		this.next = node;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setLast(Node node) {
		this.last = node;
	}
	
	public Node getLast() {
		return last;
	}

	public String toString() {
		return "ID : " + this.id;
	}
	
	public boolean compare(Node node) {
		if (id == node.getId()) {
			return true;
		}
		return false;
	}
}
