package oops.access;

// final class cant be inherited, some final classes implemented inbuilt are like Integer, Math etc
 final class FinalClass{

    // a final variable cant be reassigned ie, it cant be changed.
    // also it has to be initialised at the time of declaration

    // static final is the way of creating constants in java
    private static final String api_key = "tanish";
    private static final String api_endPoint = "xyz.com";
    public int random;

    // you cant make constructors final
    public FinalClass(int random){
        this.random = random;
    }

}

// cant inherit the final class
//class extend extends FinalClass{
//
//}