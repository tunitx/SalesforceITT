package oops.abstraction.interfaces;

import java.sql.SQLOutput;

public interface Engine {
    // in interfaces only static final constants are allowed

    default void greet(){
        System.out.println("hi im the default function from java 8");
    }

    static void greet2(){
        System.out.println("hi ijm the static function from java 8");
    }

    private void greet3(){
        System.out.println("hi im the private function from java 8");
    }

    // static final by default
     static final int age = 19;

     // by default public
    public void startEngine();
    public void stopEngine();
    public void accelerate();

}
