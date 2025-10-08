package Basics;

public class conditions {
    // if statements
    public static void main(String[] args) {
        int salary = 2000;
        if(salary > 10000){
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);
    

    // multiple if statements

        int amount = 23400;
        if(amount > 30000){
            amount += 2000;
        } else if (amount > 20000){
            amount += 1000;
        } else {
            amount += 500;
        }
        System.out.println(amount);
    }
}