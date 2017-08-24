package DoublyLinkedList;

public class DoublyLinkedList {
	private int size = 0;
	private Node root = null;
	private Node tail = null;
	private Node pointer = null;

	public void addStart(Node node) {
		if (root == null) {
			root = new Node(node.getId());
			tail = root;
		} else {
			Node newRoot = new Node(node.getId());
			newRoot.setNext(root);
			root.setLast(newRoot);
			root = newRoot;
		}
		size++;
	}

	public void addEnd(Node node) {
		if (tail == null) {
			tail = new Node(node.getId());
			root = tail;
		} else {
			Node newTail = new Node(node.getId());
			newTail.setLast(tail);
			tail.setNext(newTail);
			tail = newTail;
		}
		size++;
	}
	
	// insert() takes an integer, creates a node with it, and adds the newly created node to the list at the specified index.
	public void insert(Node node, int index) {
		if (index == 0) {
			addStart(node);
		} else if (index < size - 1 && index > 0) {
			pointer = get(index);

			// create new node with references to list
			Node ins = new Node(node.getId());
			ins.setNext(pointer.getNext());
			ins.setLast(pointer);

			// update references surrounding inserted node
			ins.getNext().setLast(ins);
			pointer.setNext(ins);

			size++;
		} else if (index == size - 1) {
			addEnd(node);
		}
	}
	
	// remove() takes a node and removes it from the list (if it exists).
	public void remove(Node node) {
		if (root.compare(node)) {
			root = root.getNext();
			root.setLast(null);
			size--;
			return;
		}

		pointer = root;
		Node prev = null;

		while (pointer != null && !pointer.compare(node)) {
			prev = pointer;
			pointer = pointer.getNext();
		}
		if (pointer == null) {
			return;
		}
		prev.setNext(pointer.getNext());
		prev.getNext().setLast(prev);
		size--;
	}

	public Node get(int index) {
		pointer = root;
		int count = 0;
		while (count < index) {
			count++;
			pointer = pointer.getNext();
		}
		return pointer;
	}
	
	// edit() takes two integers. The first integer correspond to a node and the second correspond to some data.
	// It replaces the data on the node to the data specified.
	public void edit(int index, int id) {
		if (get(index) != null)
			get(index).setId(id);
	}
	
	// size() returns the size of the list.
	public int size() {
		return size;
	}
	
	// iterate() displays the list in order from start to end
	public void iterateF() {
		pointer = root;
		int index = 0;
		while (pointer != null) {
			System.out.println(pointer.toString() + " at index: " + index);
			pointer = pointer.getNext();
			index++;
		}
	}
	
	// iterate() displays the list backwards from end to start.
	public void iterateB() {
		pointer = tail;
		int index = size - 1;
		while (pointer != null) {
			System.out.println(pointer.toString() + " at index: " + index);
			pointer = pointer.getLast();
			index--;
		}
	}
}
