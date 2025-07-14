package oops.abstraction.interfaces;

public class Car {
    private  Engine engine;
    private Braking brake;
    private MediaPlayer player;

    public Car(){
        this.engine = new PowerEngine();
        this.brake = new Brakes();
        this.player = new CDplayer();
    }

    protected void changeEngine(Engine engine){
        this.engine = engine;
    }

    protected void drive(){
        engine.startEngine();
        engine.accelerate();
        System.out.println("the car is driving");
    }
    protected void stop(){
        engine.stopEngine();
        System.out.println("the car has stopped");
    }
    protected void play(){
        player.play();
    }
    protected void pause(){
        player.pause();
    }
    protected void stopPlayer(){
        player.stop();
    }

    protected void handBrake(){
        brake.applyHandBrake();
    }
    protected void rearBrake(){
        brake.applyRearBrakes();
    }


}
