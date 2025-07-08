package oops.abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.stop();
        car.play();
        car.pause();
        car.stopPlayer();

        car.handBrake();
        car.rearBrake();
    }
}
