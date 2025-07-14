package oops.abstraction.abstractclass;

public class Main {
    public static void main(String[] args) {
//        Parent parent = new Parent();

        Parent parent = new Son();

        Son son = new Son();
        Daughter daughter = new Daughter();

        son.career("docter");
        son.partner("xyz", 18);

        daughter.career("engg");
        daughter.partner("yyysy", 34);

        parent.career("this");
        parent.partner("tttt", 33);

       parent.test();

    }
}
