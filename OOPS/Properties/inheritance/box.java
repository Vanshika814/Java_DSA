package OOPS.Properties.inheritance;

public class box {
     double l;
     double h;
     double w;
     //doubke weight;


     static void greeting(){
        System.out.println("Hello, I am in box class!!");
     }

     box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
     }

     box(double side){
        super();
        this.l=side;
        this.h=side;
        this.w=side;
     }

     box(double l, double h, double w){
        this.l=l;
        this.h=h;
        this.w=w;
     }

     box(box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
     }

     public static void main(String[] args) {
        System.out.println("Running the box.");
     }
}
