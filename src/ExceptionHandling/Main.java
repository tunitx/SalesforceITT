package ExceptionHandling;

public class Main {

    static  void divide() throws CustomException{
       int dem = 1/0;

    }

    public static void main(String[] args) {
        try{

           // do something
            divide();
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }




    }
}
