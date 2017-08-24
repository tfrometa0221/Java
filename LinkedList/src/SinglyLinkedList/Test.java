package SinglyLinkedList;

public class Test {
	  public static void main(String[] args) {
	    
	    LinkList list = new LinkList();
	    
	    list.insert(5);
	    list.insert(4);
	    list.insert(3);
	    list.insert(6);
	    list.insert(5);
	    list.insert(7);
	    list.insert(8);
	    list.insert(2);
	    System.out.println(list.size());
	    
	    list.iterate();
	    
	    list.edit(5, 1);
	    
	    list.iterate();
	    
	    list.edit(1, 5);
	    
	    list.iterate();
	    
	    list.remove(5);
	    
	    list.iterate();
	  }
	}