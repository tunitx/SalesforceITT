package ExceptionHandling.Week2;

import java.io.IOException;

public class TryCatch {
    public static void reader() throws IOException{
        System.out.println("reading file....");
        throw new IOException("this is io exception exception");
    }
    public static void main(String[] args) {

        try{
            reader();
        }
        catch (IOException e){
            // not that ioexception is a type of checked exception, which needs to be explicitly thrown
            System.out.println("io exception is caught and handled with success");
            System.out.println(e.getMessage());
        }

        // more specific exception as compared to runtimeexception
        catch (NullPointerException e){
            System.out.println("this is null ptr excepion");
        }

        catch (RuntimeException r){
            System.out.println("this is run time exception");
        }
        catch (StackOverflowError e){
            System.out.println("note : this is a runtime ERROR, nit a runtime exception");
        }
        finally {
            System.out.println("do something ....");
        }


    }
}
