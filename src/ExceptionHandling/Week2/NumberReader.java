package ExceptionHandling.Week2;

import java.util.Scanner;

enum Operation {
    div, mul, add, sub
}

public class NumberReader {

    public static Operation processOp(char op){
        switch (op){
            case '+' -> {
                return Operation.add;
            }
            case  '-' -> {
                return Operation.sub;
            }
            case '/' -> {
                return Operation.div;
            }
            case '*' -> {
                return Operation.mul;
            }
            default -> System.out.println("invalid");
        };
        return null;

    }

    public static Operation opReader(Scanner sc){
        Operation operation;
        while(true){
            System.out.print("Enter the operation ( +, -, /, *) ");
            try{
                char op = sc.next().charAt(0);
                operation = processOp(op);
                break;
            } catch (Exception e) {
                throw new RuntimeException("Invalid op, try again");
            }
        }
        return operation;
    }

    public static int numberReader(Scanner sc){
        String input;
        int num;
        input = sc.nextLine();
        try{
             num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        return num;

    }

    public static void add(int num1, int num2){
        System.out.println("The result is: " + (num1 + num2));
    }
    public static void subtract(int num1, int num2){
        System.out.println("the result is : " + (num1 - num2));
    }
    public static void divide(int num1, int num2){
        try{
            int res = num1/num2;
            System.out.println("the result is : " + res);
        }
        catch(ArithmeticException e){
            System.out.println("cant divide by 0");
        }
    }
    public static void multiply(int num1, int num2){
        long res = (long) num1 *num2;
        if(res > Integer.MAX_VALUE) throw new NumberFormatException("number too big");
    }
    public static void main(String[] args) {
        // program idea:
        //create a program that reads a number from the user (as a string).
        //
        //try to convert it into an integer using Integer.parseInt().
        //
        //if the input is invalid (e.g., user enters "abc"), it throws a NumberFormatException.
        //
        //use a try-catch block to catch this exception and print a message like “Invalid number entered!”

        Scanner sc = new Scanner(System.in);


            try{
                System.out.print("Enter first number: ");
                int num1 = numberReader(sc);
                System.out.print("Enter the second number: ");
                int num2 = numberReader(sc);

                Operation op = opReader(sc);
                switch (op){
                    case add -> add(num1, num2);
                    case sub -> subtract(num1, num2);
                    case div -> divide(num1, num2);
                    case mul -> multiply(num1, num2);

                }
            } catch (RuntimeException e) {
                System.out.println("Invalid number! pls try again!");
                System.out.println(e.getMessage());
            }


    }
}
