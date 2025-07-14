package oops.abstraction.abstractclass;

public class Car  {
    private Engine engine;
    private MediaPlayer mediaPlayer;
    private Brake brakes;

    public Car(Engine engine, MediaPlayer mediaPlayer, Brake brakes){
        this.engine = engine;
        this.mediaPlayer = mediaPlayer;
        this.brakes = brakes;
    }

    public void drive(){
        engine.startEngine();
        engine.accelerateCar();
        System.out.println("car is driving");
    }
    public void stop(){
        engine.stopEngine();
        System.out.println("the car has stopped");
    }
    public void rearBrake(){
        brakes.applyRearBrake();
    }
    public void handBrake(){
        brakes.applyHandbrake();
    }

    public void play(){
        mediaPlayer.play();
    }
    public void pause(){
        mediaPlayer.pause();
    }
}
