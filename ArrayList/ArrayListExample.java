package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(67);
        // list.add(672);
        // list.add(673);
        // list.add(6723);
        // list.add(67);
        // list.add(6745);
        // list.add(676);
        // list.add(679);
        // list.add(673);
        // list.add(672);
        // list.add(671);
        // list.add(67);
        // list.add(670); 
        // list.add(6745);
        // list.add(676);
        // list.add(679);
        // list.add(673);
        // list.add(672);
        // list.add(671);
        // list.add(67);
        // list.add(670);
        // list.set(0,99);
        // list.remove(2);
        // System.out.println(list.contains(673));
        // // System.out.println();
        // System.out.println(list);

        //input
        for(int i =0; i<10; i++){
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i =0; i<10;i++){
            System.out.println(list.get(i)); //pass index here list[index] will not work here 
        }
        // System.out.println(list);
    }
}
