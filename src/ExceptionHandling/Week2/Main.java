package ExceptionHandling.Week2;

public class Main {

    private static boolean isEven(int n){
        return n%2 == 0;
    }
    public static void main(String[] args) {
        // is it possible to catch Exception before catching NullPointerException in single try-catch block?

        // we should always put catch statements in an order such that more specific statments come before their super class varients

        try{
            // try throwing
            if(isEven(8)) throw new Exception("this is exception class");
            else throw new NullPointerException("null ptr");
        }
        catch (NullPointerException n){
            System.out.println("this is the subclass of exception class in java");
            System.out.println("hence the subclass exceptions/ more specific exceptions should be put earlier than their superclass counterparts");
        }
        catch (Exception e){
            System.out.println("this is the super classs of all the exceptions in java");
        }
    }
}
