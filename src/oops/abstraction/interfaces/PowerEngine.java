package oops.abstraction.interfaces;

public class PowerEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerating");
    }
}
