package SinglyLinkedList;

public class LinkList {
	  
	  private int size = 0;
	  private Node root = null;
	  
	  // size() returns the size of the list.
	  public int size() {
	    return size;
	  }
	  
	  // insert() takes an integer, creates a node with it, and adds the newly created node to the list.
	  public void insert(int data) {
	    if(root == null) {
	      root = new Node(data);
	    }
	    else {
	      Node temp = root;
	      while(temp.getNext() != null) {
	        if(temp.getData() == data) {
	          return;
	        }
	        temp = temp.getNext();
	      }
	      temp.setNext(new Node(data));
	    }
	    size++;
	  }
	  
	  // remove() takes an integer and removes the node corresponding to that integer (if it exists).
	  public void remove(int node) {
	    if(root != null) {
	      
	      if(root.getData() == node) {
	        root = root.getNext();
	        size--;
	      } else {
	        Node temp = root;
	        while(temp.getNext().getData() != node) {
	          temp = temp.getNext();
	        }
	        temp.setNext(temp.getNext().getNext());
	        size--;
	      }
	      
	    }
	  }
	  
	  // edit() takes two integers. The first integer correspond to a node and the second correspond to some data.
	  // It replaces the data on the node to the data specified.
	  public void edit(int node, int data) {
	    Node temp = new Node(data);
	    if(root.getData() == node) {
	      Node temp2 = root;
	      root = temp;
	      root.setNext(temp2.getNext());
	    }
	    else {
	      Node temp2 = root;
	      while(temp2.getNext().getData() != node) {
	        temp2 = temp2.getNext();
	      }
	      Node temp3 = temp2.getNext().getNext();
	      temp2.setNext(temp);
	      temp.setNext(temp3);
	    }
	  }
	  
	  // iterate() displays the list in order.
	  public void iterate(){
	    Node current = root;
	    while(current.getNext() != null) {
	      System.out.print(current.getData() + " --> ");
	      current = current.getNext();
	    }
	    System.out.println(current.getData());
	  }
	}


