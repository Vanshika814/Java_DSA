package StacksAnQueues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    //pointer inital
    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE); // calling as a constructor

    }
    public CustomStack(int size){
        this.data = new int[size]; // calling with a reference variable 
    }

    public boolean push(int item){ // insert an 
        //can be full
        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        //increase the ptr add the item
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an Empty stack!!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
        //return data[ptr--]; simple
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an Empty Stack!!");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length - 1; // ptr is at last
    }

    public boolean isEmpty(){
    return ptr == -1;
    }
}
