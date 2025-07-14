package oops.nestedclasses;

public class B {

    static class A {
        void fun (){
            System.out.println("fun from static A");
        }
        B b = new B();
        A a = new A();
    }
}

class Main {
    B.A b = new B.A();
}
