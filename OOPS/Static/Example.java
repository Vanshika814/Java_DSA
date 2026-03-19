package OOPS.Static;

public class Example {
    int age;
    String name;
    int salary;
    boolean married;
    static long Population;

    static void message(){
        System.out.println("Hello!");
       // System.out.println(this.name); // cant use this over here
    }
    public Example(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Example.Population +=1;
        Example.message();
    }
    
}
