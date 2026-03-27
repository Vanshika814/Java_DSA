package OOPS.Properties.Interfaces.ExtendDemo;

public interface A {
    void fun();
    // static interface methids should always have a body
    //call via the interface name
    //static void greeting(); not allowed
    static void greeting(){
        System.out.println("i am in the A interface");
    }
}
