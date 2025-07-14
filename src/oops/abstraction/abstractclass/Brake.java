package oops.abstraction.abstractclass;

public abstract class Brake {
    abstract void applyRearBrake();
    abstract void applyHandbrake();

    // .... other brake related methods
}

class Braking extends Brake{

    @Override
    void applyRearBrake() {
        System.out.println("rear brakes applied");
    }

    @Override
    void applyHandbrake() {
        System.out.println("hand brake applied");
    }
}
