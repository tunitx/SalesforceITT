package oops.nestedclasses;

public class A {

    class B {
        void fun(){
            System.out.println("this is the B fun");
        }
        // can we create A's object using B
        A a = new A();
        B b = new B();

    }

    A a = new A();
    B b = new B();
}

class main{
    A a = new A();
    A.B b = a.new B();
}


