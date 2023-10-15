public class CustomQueue {
    private int[] data;
    
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public boolean isFull() {
        return end == data.length; 
    }
    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if(isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }
    
    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removed = data[0];

        // shift the elements to left
        for(int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front()  {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return data[0];
    }
    public void display() {
        for(int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(12);  // First In
        queue.insert(72);
        queue.insert(44);
        queue.insert(98);
        queue.insert(64);

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.display();
    }
}
