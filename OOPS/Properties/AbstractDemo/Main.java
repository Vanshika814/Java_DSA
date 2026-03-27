package OOPS.Properties.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son =  new Son(28);
        son.career();

        Daughter daughter = new Daughter(22);
        daughter.career();

       // Parent mom = new Parent(); // error bcz you can't create objs of abstract class
       Parent.hello();

       son.normal();
    }
}
