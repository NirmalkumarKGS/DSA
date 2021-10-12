package Queue;

public class QueueArray {
    static final int SIZE = 3;
    int[] queue = new int[SIZE];

    int front =0;
    int rear = 0;

    public void enqueue(int val){
        if(rear == SIZE){
            System.out.println("Queue is full");
        }
        else{
            queue[rear] = val;
            rear++;
        }
    }
    public void dequeue(){
        if(front == rear){
            System.out.println("Queue is empty");
            queue = new int[SIZE];
        }
        else{
            System.out.println("De queued element: " + queue[front]);
            front++;
        }
    }
    public static void main(String[] args){
        QueueArray queue = new QueueArray();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
