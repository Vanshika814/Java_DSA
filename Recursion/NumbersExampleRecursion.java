package Recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    //recursive call
    //every fucntion call will take diff memory in the stack and will e treated as a diff fucntion in the memory
}
