package ExceptionHandling.OverridngExceptionHandling;

import java.util.regex.Pattern;

class MyClass {

    private static Pattern PATT = Pattern.compile("()");

}
public class Child  extends Parent{
    @Override
    public void helper(){
        // this can throw any amount of specific broad new unchecked exceptions, it doesnt matter
//        throw new NullPointerException();
        // but here you need to be carefull while throwing child class exceptions
        throw new IndexOutOfBoundsException();
    }

    public static void main(String[] args) {
        try {

            new MyClass();

        } catch (Throwable t) {}


        new MyClass();
    }
}



