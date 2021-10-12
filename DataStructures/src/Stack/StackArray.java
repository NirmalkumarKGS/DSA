package Stack;

class StackArray{
    static final int SIZE = 3;
    int array[] = new int[SIZE];
    int top = -1;

    public void push(int val){
        if(top == SIZE-1)
            System.out.println("Stack is full");
        else{
            ++top;
            array[top] = val;
        }
        
    }

    public void pop(){
        if(top == -1)
            System.out.println("Stack is empty");
        else{
            System.out.println("Deleted element = "+ array[top]);
            top--;
        }
    }

    public static void main(String[] args){
        StackArray stack = new StackArray();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.push(50);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}

