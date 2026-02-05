package StringsOperator;
import java.util.Arrays;
public class Methods {
    public static void main(String[] args) {
        String name = "Vanshika Agarwal hello world";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("    Vanshika   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
