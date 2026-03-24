package OOPS.Properties.Access;

public class A {
    protected int num;
    String name;
    int[] arr;

    public int getNum(){ // getters
        return num;
    }

    public void seNum(int num){ //setters
        this.num = num;
    }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
