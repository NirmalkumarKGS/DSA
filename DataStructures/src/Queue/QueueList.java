package Queue;

public class QueueList {
	Node front, rear = null;

	public void enqueue(int val) {

		Node newNode = new Node();
		newNode.data = val;
		newNode.next = null;
		if (front == null && rear == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}

	public void dequeue() {
		if (front == null) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("Dequeued element:" + front.data);
			front = front.next;
			if (front == null) {
				rear = null;
			}
		}
	}

	public static void main(String[] args) {
		QueueList queue = new QueueList();

		queue.enqueue(1);
		queue.enqueue(2);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
	}
}
