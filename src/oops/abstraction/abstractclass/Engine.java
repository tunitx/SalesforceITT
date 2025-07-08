package oops.abstraction.abstractclass;

public abstract class Engine {
    int a;
    void greet(){
        System.out.println("hi");
    }
   abstract void startEngine();
   abstract void stopEngine();
   abstract void accelerateCar();

    //..... other engine realted methods
}

 class PetrolEngine extends Engine{

    @Override
    void startEngine() {
        System.out.println("the engine has been started");
    }
    @Override
    void greet(){
        System.out.println("hi overrided");
    }
    @Override
    void stopEngine() {
        System.out.println("the engine has been stopped");
    }

    @Override
    void accelerateCar() {
        System.out.println("accelerating the car");
    }
}


