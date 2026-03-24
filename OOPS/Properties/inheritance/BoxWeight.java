package OOPS.Properties.inheritance;

public class BoxWeight extends box { // extends shows inheritance
    double weight;

    static void greeting(){
        System.out.println("Hey I'm in box weight class!!");
    }

    public BoxWeight(){
        this.weight = -2;
    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight){
        super(l,h,w); // what is this ? it's calling the parent class constructor
        //used to intialise values present in the parent class 
        this.weight = weight;
    }
    

    public BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
}
