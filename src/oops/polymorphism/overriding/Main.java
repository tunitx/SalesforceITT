package oops.polymorphism.overriding;

public class Main {
    public static void main(String[] args) {

        // this is known as upcasting, obj is createed of the subclass and stored in a ref variable of parent
        //in this, the created obj has access to all the public methods and instance variables of the parent
        Animal animal = new Dog("libra", "veg", "india", 18, 34);
        Animal animalParent = new Animal("x", "y", "china");
        Dog dog = new Dog("yash", "nonveg", "ajmer", 45, 77);

        // in case of same method names in both parent and child, the method of the child class is given preference
        //this is knowqn as method overiding
//        animal.printInfo();
//        animal.makeSound();



        // static method usage, static is bound to the cla=ss not to the object,
        // static method calling depends on refernce type not the object type
//        animal.move();
//        Dog.move();



        dog.printInfo();
        animalParent.printInfo();

        animalParent.makeSound();

        animal.move();





    }
}
