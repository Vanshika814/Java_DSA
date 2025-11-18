package OOPS;

import java.util.*; // package hai in java jiske andr already utility classes hai aur utility functions hai

import bank.*;


class Shape{ // base class or parent class
    public void area(){
        System.out.println("displays area");
    }
}

// single level inheritance 
class Triangle extends Shape{ // subclass
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

// ye ho gai multilevel inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    } 
}

//ye ho gai heirarchical inheritance 
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        // bank.Account account = new bank.Account();
        // account1.name = "customer1";
        
    } 
}


