package OOPS.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();
        Triangle triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();
    }
}
