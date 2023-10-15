// package StacksAndQueues; // Package name without spaces


public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push (int item) {
        if(isFull()) {
            // throw new Exception("");
            System.out.println("Cannot push of the Stack is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop () throws StackException{
        if(isEmpty()) {
            throw new StackException("Cannot pop out an empty Stack");
        }
        return data[ptr--];
    }

    public int peak() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peak in an empty Stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at the last index
    }

    public boolean isEmpty() {
        return ptr == -1; // array is empty
    }
}
