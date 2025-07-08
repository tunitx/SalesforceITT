package oops.polymorphism.overloading;


import oops.access.Test;

public class test extends Test {

    test (){
        super(19, "tanish", "wuww");
    }

    //overloading methods in java happens at compile time and this is a type of compiler tyime polymorphism
    //following rules for method overloading
    //1. no two/more method definations should have ambiguity among paramters, type etc
    //2.shuffling parameter types, paramters name is allowed as long as they dont create ambguity amongst method
    //definations
    //3.  Method name stays the same, but parameter list must be different — either in number, type, or order.
    //4. Methods return type DOESNT matter in overloading


    //same params diff return type
    // doesnt work cuz it creates ambiguity among the paramters
    double helper(int volt) {
        System.out.println("hi1");
        return 2;
    }
//    int helper(int volt){
//        System.out.println("hi2");
//        return 1;
//    }


    //ambiguity again
//    int helper(int volt, String t){
//        return -1;
//    }
    int helper(int volt, String str) {
        System.out.println("hi3");
        return 1;
    }

    //not in this case
    int helper(int volt, String str, int e) {
        System.out.println("hi3");
        return 1;
    }



    double helper(String str, int volt) {
        System.out.println("hi4");
        return 1;


    }
//    double helper(int volt, String h){
//        return 8;
//    }
   void ageModifier(int age){
        setAge(age);
   }

   void passwordModifier(String password){
        setPassword(password);
   }
   void changeName(String name){
        setName(name);
   }

   void printAge(){
        //get age isnt visible cuz it is set as default, so it wont be available outside the package
       System.out.println();
   }

    double helper(String s, int t, int l) {
        return 2;
    }





}

