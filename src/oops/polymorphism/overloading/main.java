package oops.polymorphism.overloading;

class Person {
    String getName() {
        return "Unknown";
    }

    int getAge() {
        return 0;
    }
}

class Student extends Person {
    @Override
    String getName() {
        return "Alice";
    }

    @Override
    int getAge() {
        return 20;
    }

    String getName(String title) {
        return title + " Alice";
    }

    Student getDetails() {
        return this;
    }
}

class Teacher extends Person {
    @Override
    String getName() {
        return "Mr. John";
    }

    String getName(int id) {
        return "ID " + id + ": Mr. John";
    }

    Teacher getDetails() {
        return this;
    }
}

public class main {

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
        System.out.println(s.getName("Ms."));
        System.out.println(s.getDetails().getAge());

        Teacher t = new Teacher();
        System.out.println(t.getName());
        System.out.println(t.getName(101));
        System.out.println(t.getDetails().getName());
    }

}


