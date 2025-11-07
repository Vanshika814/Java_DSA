package Methods_and_functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(0, 0);
        System.out.println((a + " " + b));
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
// won't work