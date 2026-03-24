package OOPS.Properties.Access;

public class SubClass extends A{

    public SubClass(int num, String name){
        super(num, name);
    }
    public static void main(String[] args){
        SubClass obj = new SubClass(52, "vanshika");
        int n = obj.num;
        // System.out.println(obj instanceof A);
        // System.out.println(obj instanceof SubClass);
        // System.out.println(obj instanceof Object);
        System.out.println(obj.getClass().getName());
    }
}
