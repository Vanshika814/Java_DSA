package OOPS.Static;

public class Main {
    public static void main(String[] args) {
        Example Vanshika = new Example(20, "Vnashika agarwal", 10000, false);
        Example lakshit = new Example(23, "lakshit agarwal", 100000, true);
        Example avnsh = new Example(27, "vansh", 150000, true);

        System.out.println(Example.Population);
        System.out.println(Example.Population);
        System.out.println(Example.Population);

    }
    static void fun(){ //this is not dependent on objects
       // greetings(); // you cant use this bcz it requires an instance
        //but the function you are using it in does not depend on instances 


        //you cannot access non static stuff without referencing their instances in a static context
        //hence here i am referencing it
        Main obj = new Main();
        obj.greetings();
    }

    void fun2(){
        greetings();
    }
    
    void greetings(){ //we know that something which is not static, belongs to an object
        fun();
        System.out.println("Hello!!");
    }
}
