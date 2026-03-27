package OOPS.Properties.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        // Engine car2 = new Car(); // THIS IS allowed 
        // car.acc();
        // car.start();
        // //car.brake();
        // car.stop();

        NiceCar car2 = new NiceCar();
        car2.start();
        car2.startMusic();
        car2.upgardeEngine();
        car2.start();
    }
}
