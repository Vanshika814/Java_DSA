package StacksAnQueues;

public class DynamicStack extends CustomStack {
    
    public DynamicStack(){
        super(); // it will call the Customstack() one
    }

    public DynamicStack(int size){
        super(size); // it will call the Customstack(int size) one
    }

    @Override
    public boolean push(int item){
        //this take care of it being full
        if(this.isFull()){
            //double the size of array
            int[] temp = new int[data.length * 2];

            //copy all previous items in the new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        //at this point we know that the array is full
        //insert item
        return super.push(item);

    }
}
