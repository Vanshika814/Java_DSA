package OOPS.Properties.Interfaces;

public class NiceCar {
    private Engine engine; //
    private Media player = new CDPlayer();

    public NiceCar(){ //constructor
        engine = new PowerEnigine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upgardeEngine(){
        this.engine = new ElectricEngine();
    }

}
