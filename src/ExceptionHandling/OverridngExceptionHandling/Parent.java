package ExceptionHandling.OverridngExceptionHandling;

import java.io.IOException;

public class Parent {
    public void helper() throws IOException, Exception {
        throw new RuntimeException("hii");
    }
}
