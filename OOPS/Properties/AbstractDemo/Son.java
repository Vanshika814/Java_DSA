package OOPS.Properties.AbstractDemo;

public class Son extends Parent {

    public Son(int age){
        super(age); // this is we have a constructor of this in parent itself
       // this.age = age;
    }

    @Override
    void normal(){
        super.normal();
    }
    @Override
    void career(){
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner(){
        System.out.println("I love pepper pots");
    }
}
