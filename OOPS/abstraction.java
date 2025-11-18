package OOPS;

// abstract class Animal{
//     abstract void walk();
//     Animal(){
//         System.out.println("You are craeting a new animal");
//     }
//     public void eats(){
//         System.out.println("animal eats");
//     }
// }

// class Horse extends Animal{
//     Horse(){
//         System.out.println("Created a horse");
//     }
//     public void walk(){
//         System.out.println("Walks on 4 legs");
//     }
// }

// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }


interface Animal{
    int eyes = 2;
    void walk();
    
}

interface Herbivore{
    
}

class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}


public class abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();

        h1.walk();
        // h1.eats();
    }
}
