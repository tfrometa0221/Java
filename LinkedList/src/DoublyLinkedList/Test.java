package DoublyLinkedList;

public class Test {

	public static void main(String[] args) {
		
		DoublyLinkedList list = new DoublyLinkedList();
		Node node = new Node(1);
		Node node2 = new Node(2);
		
		list.addEnd(node);
		list.addEnd(node2);
		list.addEnd(node);
		list.addEnd(node2);
		System.out.println("Length : "+list.size());

		list.remove(node);
		System.out.println("Length : "+list.size());
		list.remove(node2);
		
		Node node3 = new Node(3);
		list.addStart(node3);
		Node node4 = new Node(4);
		list.insert(node4, 2);
		list.remove(node3);
		System.out.println("Length : "+list.size());
		
		System.out.println("forwards");
		list.iterateF();
		System.out.println("backwards");
		list.iterateB();
		
		System.out.println(list.get(1).toString());
		list.edit(1, 10);
		System.out.println(list.get(1).toString());
		System.out.println("forwards");
		list.iterateF();
	}
}
