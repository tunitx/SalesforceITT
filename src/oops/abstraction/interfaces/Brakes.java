package oops.abstraction.interfaces;

public class Brakes implements Braking {

    @Override
    public void applyRearBrakes() {
        System.out.println("Rear brake applied");
    }

    @Override
    public void applyHandBrake() {
        System.out.println("hand brake applied");
    }
}
