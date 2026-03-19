package OOPS.Static;

public class Innerclass { //outside classes can't be static
   static class Test{
        String name;
        
        public Test(String name){ //contructor
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Lakshit");
        Test b = new Test("Vanshika");
       // System.out.println(a);
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
