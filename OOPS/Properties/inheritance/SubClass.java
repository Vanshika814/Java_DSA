package OOPS.Properties.inheritance;
import OOPS.Properties.Access.A;

public class SubClass extends A{

    public SubClass(int num, String name){
        super(num, name);
    }
    
    public static void main(String[] args){
        SubClass obj = new SubClass(52, "vanshika");
    //    int n = obj.num;
    }
}

class SubSubClass extends SubClass{
    public SubSubClass(int num, String name){
        super(num, name);
    }
    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(10, "name");
        int n = obj.num;
    }
}

class SubClass2 extends A{
    public SubClass2(int num, String name){
        super(num,name);
    }
    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(98,"nameeee");

    }
}