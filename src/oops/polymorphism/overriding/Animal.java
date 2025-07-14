package oops.polymorphism.overriding;

public class Animal {
    String name;
    String dietType;
    private String origin;

    public Animal(String name, String dietType, String origin) {
        this.name = name;
        this.dietType = dietType;
        this.origin = origin;
    }

    //copy constructor
    public Animal(Animal obj){
        //do something
        this.name = obj.name;
    }

    public void printInfo(){
        System.out.println("this info is being printed by the super class");
        System.out.println(this.name + " " + this.dietType + " " + this.origin);
    }

    //applying final locks the method, thus this method cant be overriden in subclass, so this leads to early binding
    final void makeSound(){
        System.out.println("sound from parent class");
    }

    // static usage

    // static is bound to the class not to the object

    public static void  move(){
        System.out.println("moving called by parent class");
    }



}
