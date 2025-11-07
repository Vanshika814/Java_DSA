package Methods_and_functions;

public class Shadwoing {
    static int x = 10; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);  // 10
        int x; // class varibale at line 4 is shadowed by this
        x = 30; // initialised
        System.out.println(x); // 39
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
