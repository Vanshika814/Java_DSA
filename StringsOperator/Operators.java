package StringsOperator;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        // System.out.println('a' + 'b');
        // System.out.println("a" +"b");
        // System.out.println((char)('a' +3));
        // System.out.println(('a' +3));
        // System.out.println("a" + 1); //integer will be converted to Integer that will call toString()

        System.out.println("vanshika" + new ArrayList<>());
        System.out.println("Vanshika" + new Integer(56));
        String ans = new Integer(56) +""+ new ArrayList<>();
        System.out.println(ans);


    }
}
