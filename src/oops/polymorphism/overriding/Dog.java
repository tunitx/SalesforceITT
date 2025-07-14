package oops.polymorphism.overriding;

public class Dog extends  Animal{

    int age;
    int weight;

    public Dog(String name, String dietType, String origin, int age, int weight) {
        super(name, dietType, origin);
        this.age = age;
        this.weight = weight;
    }

//    @Override
     public void printInfo(){
        System.out.println("this is the childclass printinfo function");
        System.out.println(this.name + " " + this.dietType);
        //cant adccess origin cuz its private
    }

    //**** cant be overriden cuz of final in parent class****
//    void makeSound(){
//        System.out.println("sound from subclass");
//    }

   public  static void move(){
       System.out.println("move called by subclass");
    }
}
