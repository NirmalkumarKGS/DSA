package LinkedList;

public class SinglyCircularLinkedList {
    Node head;
    Node last;

	public void add(int val) {
		addLast(val);
	}

	public void remove(int val) {
		delete(val);
	}

    public void addFirst(int val)
    {
        Node newNode = new Node();
        newNode.data = val;

        if(head == null)
        {
            newNode.next = newNode;
            head = newNode;
            last = newNode;
        }
        else
        {
             last.next = newNode;
             newNode.next = head;
             head = newNode;
        }
    }

    public void addLast(int val){
        Node newNode = new Node();
        newNode.data = val;

        if(head == null){
            newNode.next = newNode;
            head = newNode;
            last = newNode;
        }
        else{
            last.next = newNode;
            newNode.next = head;
            last = newNode;
        }
    }

    public boolean contains(int key){
        
        if(head == null)
            return false;
            
        Node temp = head;

        do{
            if(temp.data == key){
                return true; 
            }
            temp = temp.next;
        }while(temp != head);

        return false;
    }

    public void delete(int key){

        if(head == null){
            System.out.println("LinkedList is empty!");
            return;
        }

        if(head.data == key && head == last){
            head = null;
            last = null;
            return;
        }
        else if(head.data == key){
            last.next = head.next;
            head = head.next;
        }
        else{
            Node someMiddleNode = head;

            while(someMiddleNode.next != head){
                if(someMiddleNode.data == key)
                    break;
                someMiddleNode = someMiddleNode.next;
            }

            someMiddleNode.next = someMiddleNode.next.next;

        }

        System.out.println("Elements after deleting:");
        print();
    }

	public void printFirst() {
		System.out.println("First node: " + head.data);
	}

	public void printLast() {
		System.out.println("Last node: " + last.data);
	}

    public void print()
    {
        if(head == null)
            return;

        Node temp = head;

        do
        {
            System.out.println(temp.data);
            temp = temp.next;
        }while(temp != head);
    }

    public static void main(String args[]){

        SinglyCircularLinkedList list = new SinglyCircularLinkedList();
        list.addFirst(10);
        list.addFirst(5);
        list.addLast(30);
        list.add(40);
        list.add(50);
        list.print();

        System.out.println("Searching for key: 25");
        if(list.contains(25))
            System.out.println("Key found!");
        else
            System.out.println("Key not found!");

        System.out.println("Delete for key: 20");
        list.remove(50);
        
		list.printLast();

    }
}
