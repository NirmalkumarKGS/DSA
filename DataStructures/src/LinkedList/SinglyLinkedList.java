package LinkedList;

public class SinglyLinkedList {
	Node head;
	Node last;

	public void add(int val) {
		addLast(val);
	}

	public void remove(int val) {
		deleteNode(val);
	}

	public void addFirst(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = head;

		if (head == null)
			last = newNode;
		head = newNode;
	}

	public void addLast(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = null;

		if (head == null) {
			head = newNode;
			last = newNode;
		} else {
			Node lastNode = last;
			lastNode.next = newNode;
			last = newNode;
		}

	}

	public void printList() {
		System.out.println("LinkedList Elements Are: ");
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void printFirst() {
		System.out.println("First node: " + head.data);
	}

	public void printLast() {
		System.out.println("Last node: " + last.data);
	}

	public void deleteNode(int key) {
		if (head.data == key)
			head = head.next;
		else {
			Node temp = head;
			while (temp.next != null) {
				if (temp.next.data == key) {
					temp.next = temp.next.next;
					break;
				} else
					temp = temp.next;
			}

		}
	}

	public Node search(int key) {
		Node temp = head;

		while (temp != null) {
			if (temp.data == key)
				return temp;
			temp = temp.next;
		}

		return null;
	}

	public boolean contains(int key) {
		Node temp = head;

		while (temp != null) {
			if (temp.data == key)
				return true;
			temp = temp.next;
		}

		return false;
	}

	public static void main(String args[]) {
		System.out.println("LinkedList: ");
		SinglyLinkedList newList = new SinglyLinkedList();
		newList.addFirst(10);
		newList.addFirst(20);
		newList.addLast(30);
		newList.add(40);
		newList.add(50);

		newList.printLast();


		newList.deleteNode(10);
		Node search = newList.search(30);
		if (search == null)
			System.out.println("Data not found");
		else
			System.out.println("Data found");

		newList.printList();
		
		newList.remove(20);
		
		newList.printFirst();

		newList.remove(30);
		
		newList.printLast();

		newList.remove(40);

		newList.remove(50);

		newList.printList();
	}
}