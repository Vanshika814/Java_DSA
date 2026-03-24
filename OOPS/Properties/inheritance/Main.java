package OOPS.Properties.inheritance;

public class Main {
    public static void main(String[] args) {
      //  box Box1 = new box(3.3,4,5);
       // box Box2 = new box(Box1);
        //System.out.println(Box1.l + " " + Box1.h + " " + Box1.w);

        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight(2,3,4,5);
        // System.out.println(box3.h + " " + box3.weight);

        // box Box5 = new BoxWeight(2,3,4,5);
        // System.out.println(Box5.w);

        //there are many variables in both parent and child classes, you are given access to varibales that are in the ref type i.e. boxweight
        //hence, you shud have access to weigth variable
        // this also means, that the ones you are trying to access shoud be initailised 
        //but here, when the obj itself is of type parent class, how will you call the constructor of the child calss
        // this is why the error

      //  BoxWeight Box6 = new box(2,3,4);
        //System.out.println(Box6.weight);

        BoxPrize box = new BoxPrize(5,7,8);


        //box.greeting();

        box Box = new BoxWeight();
        Box.greeting(); // you can inherit but you cannot override.  
    }
}
 