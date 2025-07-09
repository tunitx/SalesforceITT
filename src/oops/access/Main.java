package oops.access;



import java.util.Scanner;

public class Main {

    // use of Scanner class

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FinalClass obj = new FinalClass(4);
//        sout
        System.out.println(obj.getClass());
//        System.out.println(ob);
        System.out.println(String.class);
        System.out.println("input a number");
        sc.nextInt();

        System.out.println("input a sentence");

        // this implmentation leaves endline character in the input buffer as the nextint stops processing after a whitespace so input buffer still contains "\n"

        //flush out input buffer
        sc.nextLine();

        System.out.println("enter the sentence again");
        sc.nextLine();

        // also a way to flush out any left charcters in buffer
        while(sc.hasNextLine()){
            String trash = sc.nextLine();
            if(trash. isEmpty()) break;
        }
    }

}
