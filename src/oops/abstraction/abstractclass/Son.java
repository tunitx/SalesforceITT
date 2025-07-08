package oops.abstraction.abstractclass;

public class Son extends Parent {
    @Override
    void career(String name) {
        System.out.println("son is going to be a " + name);
        this.name = name;
    }

    @Override
    void partner(String partnerName, int age) {
        System.out.println("son has a partner named " + partnerName + " of age " + age);
        this.age = age;
        this.partnerName = partnerName;
    }

    static void test(){
        System.out.println("this is the test method from child");
    }


}
