package Methods_and_functions;

public class Scope { // means where we can access our variables 
    public static void main(String[] args) {
        int a = 10; // a willl only be vaild here bcz declared here
        int b = 20;

        {
            a = 76; // block scope , already initialised value can be changed but can't be initialised inside the block
            int c = 63;
        }
        int c = 999; // anything init inside the block can be init outside the block
        System.out.println(a);
       // System.out.println(c); //block scope
    }
    static void random(int marks) {
        //System.out.println(a);       // giving err bcz a is not declared here and hence not a part of this piece of funct.
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
  

// function Scope : - means any variable defined in a function can only be accessed in the funct.
// block scope : - values initialised in a block will remain in the block