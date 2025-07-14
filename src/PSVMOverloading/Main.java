package PSVMOverloading;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("Main with String[]");
//        main("Hello");
//    }


    public static void main(String... args) {
        System.out.println("Number of args: " + args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
    public static void main(String something) {
        System.out.println(something);
        main("tanish", "hshshs", "shgshs");
    }


}
