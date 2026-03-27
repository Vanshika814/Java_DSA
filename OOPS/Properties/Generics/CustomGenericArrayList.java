package OOPS.Properties.Generics;
import java.util.ArrayList;
import java.util.Arrays;
public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10; // static bcz not gonna depend on object
    private int size = 0; // also working as index value

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
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
        Object[] temp = new Object[data.length * 2];
        //copy the current items in the new array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
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
        ArrayList<Integer> list2 = new ArrayList<>();
        CustomGenericArrayList<Integer> list3 = new CustomGenericArrayList<>();
        for (int i=0; i<14; i++){
            list3.add(2*i);
           }
           System.out.println(list3);
        // list3.add(76);
        // System.out.println(list3);
    }
}
