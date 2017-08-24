package SinglyLinkedList;

public class Node {
	  
	  private Integer data;
	  private Node next;
	  
	  //Constructor
	  public Node(int data) {
	    this.data = data;
	    this.next = null;
	  }
	  
	  public Node getNext() {
	    return next;
	  }
	  
	  public void setNext(Node next) {
	    this.next = next;
	  }
	  
	  public int getData() {
	    return data;
	  }
	  
	  public void setData(int data) {
	    this.data = data;
	  }
	  
	  public String toString() {
	    return "Data : " + data.toString();
	  }
	}