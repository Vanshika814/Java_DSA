package Basics;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        
        switch(empID){
            case 1:
                System.out.println("Vanshika Agarwal");
                break;
            case 2:
                System.out.println("Lakshit Agarwal");
                break;
            case 3:
                System.out.println("Harshit budraja");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "CS":
                        System.out.println("Computer science");
                        break;
                    default:
                        System.out.println("Enter a valid department");
                }
                break;
            default:
                System.out.println("Enter a valid id");
        }
    }
}
