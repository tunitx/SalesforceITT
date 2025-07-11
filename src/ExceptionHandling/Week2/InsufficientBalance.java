package ExceptionHandling.Week2;

// extending throwable & exception class always gives a checked exception by default
// extending runtimexception gives uncheked exceptions, hence here one showuld use throws to handle any exceptions
public class InsufficientBalance extends Throwable {
    public InsufficientBalance(String message){
        super(message);
    }
}
