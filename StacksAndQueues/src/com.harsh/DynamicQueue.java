public class DynamicQueue {
    private int[] data;
    
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public DynamicQueue() {
        this(DEFAULT_SIZE);
    }

    public DynamicQueue(int size) {
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
            int[] temp = new int[data.length * 2];
            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
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
        System.out.println("END: " + end);
        for(int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(12);  // First In
        queue.insert(72);
        queue.insert(44);
        queue.insert(98);
        queue.insert(64);
        queue.insert(34);
        queue.insert(92);
        queue.insert(684);
        

        queue.display();

        System.out.println( "Removed Item :" + queue.remove());
        System.out.println( "Removed Item :" + queue.remove());
        System.out.println( "Removed Item :" + queue.remove());
        System.out.println( "Removed Item :" + queue.remove());
        System.out.println( "Removed Item :" + queue.remove());
        System.out.println( "Removed Item :" + queue.remove());
        System.out.println( "Removed Item :" + queue.remove());
        System.out.println( "Removed Item :" + queue.remove());
        System.out.println( "Removed Item :" + queue.remove());
        queue.display();
    }
}
