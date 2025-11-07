package Methods_and_functions;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Q: take input of two integrs and prinT the sum

        //sum(); // function call


        // int ans = sub(); // return value will be stored here
        // System.out.println(ans); // get printed here


        int ans = multiply(5, 4);
        System.out.println(ans);
    }

    //pass the value of nums when you are calling the method in main()
    static int multiply(int a, int b){
        int multi = a*b;
        return multi;
    }

    // return a value
    static int sub(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sub = num1 - num2;
        return sub; // going to return a value of b also means the function over
        
    }

        static void sum (){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number 1: ");
            int num1 = in.nextInt();
            System.out.println("Enter number 2: ");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            System.out.println("The sum is:"+ sum);
        
    }
}
