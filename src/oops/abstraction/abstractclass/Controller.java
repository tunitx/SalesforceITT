package oops.abstraction.abstractclass;

public class Controller {
    public static void main(String[] args) {
        Engine engine = new PetrolEngine();
        engine.greet();
        MediaPlayer mediaPlayer = new Media();
        Brake brake = new Braking();
//        Car car = new Car()

        Car car = new Car(engine, mediaPlayer,brake);
        car.drive();
        car.stop();
        car.handBrake();
        car.rearBrake();
        car.play();
        car.pause();
    }
}
