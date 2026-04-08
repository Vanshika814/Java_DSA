package StacksAnQueues;

public class DynamicQueue extends CircularQueue{

    public DynamicQueue(){
        super(); // it will call the CicularQueue() one
    }

    public DynamicQueue(int size){
        super(size); // it will call the CircularQueue(int size) one
    }
    @Override
    public boolean insert(int item){
        //this take care of it being full
        if(this.isFull()){
            //double the size of array
            int[] temp = new int[data.length * 2];

            //copy all previous items in the new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end=data.length;
            data=temp;
        }
        //at this point we know that the array is full
        //insert item

        return super.insert(item);

    }
}
