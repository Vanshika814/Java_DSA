package OOPS.Properties.Access;

public class ObjectDemo {
    int num;
    double val;

     public ObjectDemo(int num, double val){
        this.num = num;
        this.val = val;
     }

    //  public ObjectDemo(){
    //     super();
    //  } 

     @Override
     public int hashCode(){ // a unique no. representation of an object
        return super.hashCode();
        //return num;
     }

     @Override
     public boolean equals(Object obj){
        return this.num == ((ObjectDemo)obj).num;
     }

     @Override
     protected Object clone() throws CloneNotSupportedException {
        return super.clone();
     }

//these 2 already done
     @Override
     public String toString(){ //gives the string representation
        return super.toString();
     }

     @Override
     protected void finalize() throws Throwable{ //gets call when garbage collection hits
        super.finalize();
     }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34, 76.9);
        ObjectDemo obj2 = new ObjectDemo(34, 43.7);

        //hascode
        // System.out.println(obj.hashCode());
        // System.out.println(obj2.hashCode());


        //equals
        if(obj == obj2){ //comparitor
            System.out.println("obj is equal to obj2");
        }
        //or
        if(obj.equals(obj2)){ //method
            System.out.println("obj is equal to obj2");
        }


    }
}
