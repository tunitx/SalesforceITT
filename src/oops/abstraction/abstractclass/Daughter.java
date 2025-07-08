package oops.abstraction.abstractclass;

public class Daughter extends Parent {
    @Override
    void career(String name) {
        System.out.println("daughter is going to be a " + name);
        this.name =name;
    }

    @Override
    void partner(String partnerName, int age) {
        System.out.println("daughter has a partner named " + partnerName + " of age " + age);
        this.partnerName = partnerName;
        this.age = age;
    }
}
