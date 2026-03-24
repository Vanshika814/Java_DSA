package OOPS.Properties.Polymorphism;

public class Shapes {
    
    void area(){
        System.out.println("I am a Shape");
    }
}
  
// final keyword is used to prevent a method from being overridden in a subclass, early binding is done.
// final void area(){
//     System.out.println("I am a Shape");
// }