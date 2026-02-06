package Recursion;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    static int fibo(int n){
        //base condition
        if(n<2){
            return n; //for 1st and 2nd fibo number
        }
        return fibo(n-1) + fibo(n-2);
    }
}
