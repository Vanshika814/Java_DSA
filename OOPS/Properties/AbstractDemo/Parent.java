package OOPS.Properties.AbstractDemo;

public abstract class Parent {
    int age; //1.
    final int VALUE;

    public Parent(int age){ //2.
        this.age = age;
        VALUE = 8236168;
    }

   // abstract Parent(); // 3.

   static void hello(){
    System.out.println("hey");
   }

   void normal(){ // normal methods 
    System.out.println("hey this is a normal one");
   }
    abstract void career();
    abstract void partner();
}





// 1. we can have variables over here, you just need to create their constructor in the child class obviously
// 2. can we create a constructor of an abstract class ? yess we can
//3. can we create abstract contructors ? no bcz they don't have a body