package Basics;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch(fruit){ // duplicate cases not allowed
            case "Mango":
            System.out.println("A yellow fruit");
            break;
            case "Apple":
            System.out.println("A round fruit");
            break;
            case "Grapes":
            System.out.println("A small fruit");
            break;
            case "Orange":
            System.out.println("A big fruit");
            break; // if no break then it will keep on executing
            default: // goes in end only
            System.out.println("Please enter a fruit");
        }
    }
}
