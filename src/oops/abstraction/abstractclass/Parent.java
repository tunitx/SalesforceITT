package oops.abstraction.abstractclass;

public abstract class Parent {

     int age;
     String name;
     String partnerName;
     abstract void career(String name);
     abstract void partner(String partnerName, int age);

     static void test(){
         System.out.println("this is the test method");
     }

}
