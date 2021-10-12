package LinkedList;

public class DoublyLinkedList {

	Node head;
	Node last;

	public void addFirst(int val) {
		Node newNode = new Node();
		newNode.data = val;
		if (head == null) {
			newNode.prev = null;
			newNode.next = null;
			head = newNode;
		} else {
			newNode.prev = null;
			newNode.next = head;
			head.prev = newNode;

			head = newNode;
		}
	}

	public void addLast(int val) {
		Node newNode = new Node();
		newNode.data = val;

		if (head == null) {
			newNode.prev = null;
			newNode.next = null;
			head = newNode;
		} else {
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
			newNode.next = null;
		}
	}

	public boolean search(int val) {
		Node temp = head;

		while (temp != null) {
			if (temp.data == val)
				return true;
			temp = temp.next;
		}
		return false;
	}

	public void delete(int key) {
		if (head == null)
			return;
		Node temp = head;

		while (temp != null && temp.data != key) {
			temp = temp.next;
		}

		if (temp == null)
			System.out.println("Key not found!");
		else if (temp.next == null)
			temp.prev.next = null;
		else {
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
		}
	}

	public void print() {
		Node temp = head;
		Node last = null;

		System.out.println("Forward Traversal");
		while (temp != null) {
			System.out.println(temp.data);
			if (temp.next == null)
				last = temp;
			temp = temp.next;
		}

		System.out.println("Backward Traversal");
		temp = last;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
	}

	public static void main(String args[]) {
		DoublyLinkedList list = new DoublyLinkedList();

		System.out.println("LinkedList elements are:");
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);

		System.out.println("search for 100");
		if (list.search(100))
			System.out.println("Element Found!");
		else
			System.out.println("Element not found!");

		System.out.println("Delete Element 50");
		list.delete(50);

		System.out.println("Delete Element 50");
		list.delete(40);

		list.print();

	}
}
