package Stack;

class StackList {
    Node head;

    public void push(int val){
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;

        head = newNode;
    }

    public void pop(){
        if(head == null)
            System.out.println("Stack is empty");
        else{
            System.out.println("Deleted element = "+ head.data);
            head = head.next;
        }
    }

    public static void main(String[] args){
        StackList list = new StackList();
        
        list.push(10);
        list.push(20);
        list.push(30);
        list.pop();
        list.push(50);
        list.push(60);
        list.push(70);
        list.push(80);
        list.push(90);
        list.pop();
        list.pop();
        list.pop();
        list.pop();
    }
}
