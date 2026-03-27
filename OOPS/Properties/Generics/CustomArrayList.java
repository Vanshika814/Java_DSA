package OOPS.Properties.Generics;
import java.util.Arrays;
import java.util.ArrayList;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10; // static bcz not gonna depend on object
    private int size = 0; // also working as index value

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){ // means the array is full
        return size == data.length;
    }
    private void resize(){
        int[] temp = new int[data.length * 2];
        //copy the current items in the new array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }
    @Override
    public String toString(){
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }


    public static void main(String[] args) {
       // ArrayList list = new ArrayList();

       CustomArrayList list = new CustomArrayList();
    //    list.add(5);
    //    list.add(6);
    //    list.add(7);
       for (int i=0; i<14; i++){
        list.add(2*i);
       }
       System.out.println(list);
    }
}


//PROBLEMS WITH OUR ARRAY LIST : -
// here by default it's an integer array so storing just integers but that's not true for arraylist
// so that's how generic come in picture - a paramatarized type you can say
