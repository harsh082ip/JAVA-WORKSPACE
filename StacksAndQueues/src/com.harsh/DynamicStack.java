// package StacksAndQueues;

public class DynamicStack extends CustomStack{
    
    public DynamicStack() {
        super(); // it will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size);
    }

   
    @Override
    public boolean push(int item) {
        // ensures Stack is not full
        if(this.isFull()) {
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

         // at this point we know that array is not full
        // insert item
        return super.push(item);
    }
}
