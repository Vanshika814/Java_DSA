package OOPS.Properties.Polymorphism;

public class Circle extends Shapes {
    @Override // this is called annotatons

    //this will run when the object of cIRCLE IS CREATED
    //hence it is overriding the parent method
    void area(){
        System.out.println("area is 3.14*r*r");
    }
}
