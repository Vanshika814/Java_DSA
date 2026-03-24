package OOPS.Properties.inheritance;

public class BoxPrize extends BoxWeight {
    double prize;

    BoxPrize(){
        super();
        this.prize = -1;

    }
    BoxPrize(BoxPrize other){
        super(other);
        this.prize = other.prize;
    }

    public BoxPrize(double l, double w, double h, double weight, double prize){
        super(l,w,h,weight);
        this.prize = prize;
    }

    public BoxPrize(double side, double weight, double prize){
        super(side,weight);
        this.prize = prize;
    }

}
