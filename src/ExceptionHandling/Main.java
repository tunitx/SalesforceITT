package ExceptionHandling;

import java.io.IOException;

public class Main {

    // throw -> this keyword is used to throw both checked and unchecked exceptions but mostly compile time exceptions
    static void test2(){

    }
    static  void divide() throws CustomException{
        try{
            int dem = 1/0;
        } catch (Exception e) {
            throw new CustomException("HIII");
        }
    }

    public static void test() throws IOException, CustomException {

            System.out.println("i tried something");
            System.out.println("and i failed");
            throw new CustomException("hahah");
//            throw new IOException("im tanish");
    }

    public static void change(Integer str ){
        str = 999;
    }
    public static void main(String[] args) {

        Integer a = 19;
        change(a);
        System.out.println(a);
        String str = null;
        System.out.println(str instanceof String);
        char ch = 'A';
         str = "str";
//        System.out.println((int)ch);

       
        switch (str) {
            case "tanish":
                System.out.println("A");
                break;
            default:
                System.out.println("Default");
        }



        try{

           // do something
            test();
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch (CustomException e){
            System.out.println("hi");
        }
        catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }


    }
}
