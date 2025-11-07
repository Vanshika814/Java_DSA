package Basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from user till the user does not press X or x

        int ans = 0;
        while(true){
            // take operator input
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op =='*' || op == '%' || op == '/'){
                //input two numbers 
                System.out.println("Enter a: ");
                int a = in.nextInt();
                System.out.println("Enter b: ");
                int b = in.nextInt();
                System.out.println();
                if(op == '+'){
                    ans = a + b;
                }
                if(op == '-'){
                    ans = a - b;
                }
                if(op == '*'){
                    ans = a * b;
                }
                if(op == '/'){
                    if(b != 0){
                        ans = a / b;
                    }  
                }
                if(op == '%'){
                    ans = a / b;
                     
                } 
            }
            else if (op == 'x' || op =='X'){
                break;
            } else {
                System.out.println("invalid operation!!!!");
            }
            System.out.println(ans);
            
        }
    }
}
