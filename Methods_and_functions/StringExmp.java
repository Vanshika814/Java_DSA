package Methods_and_functions;

public class StringExmp {
    public static void main(String[] args) {
       // String message = greet();
       // System.out.println(message);

       String personalized = myGreet("Vanshika");
       System.out.println(personalized);
    }

    static String myGreet(String name){
        String message = "hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}
