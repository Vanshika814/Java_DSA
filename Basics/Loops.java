package Basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        //print numbers 1 to 5
        for(int num = 1; num <=5; num++){
            System.out.println(num);
        }

        //print nums 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int num = 1 ; num <= n; num += 1){   //(initialization, condition, increment)
            System.out.println(num);
        }


        //while loops
        int num = 1; // initaialization
        while(num <= n){ // condition
            System.out.println(num);
            num += 1; // increment
        }


        //do while loops
        int a = 1;
        do{
            System.out.println("Hello world");
        } while(a != 1);
    }
}
