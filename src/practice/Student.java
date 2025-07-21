package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

// this file contains the brief usage of iterator, iterable, comparator, comparable, and with a simple intro on how to use consumer interface to simplify code

 public  class Student implements Comparable<Student>{
    private int id;
    private String name;
    private double marks;



    @Override
    public int compareTo(Student s1) {
        // descending order
        return Integer.compare(s1.id, this.id);
    }

     static class comp implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2){
            return Integer.compare(s1.id, s2.id);
        }
    }


    public Student(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    private static void printList(List<Student> list){
        System.out.println();
        list.forEach(s -> {
            System.out.println("id : " + s.id + " Name :" + s.name + " Marks: " + s.marks);
        });
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "tanish", 99);
        Student s2 = new Student(2, "yash", 0.66);
        Student s3 = new Student(3, "tushar" ,1.8);
        Student s4 = new Student(12, "augustya", 22);
        Student s5 = new Student(9,"bhavesh", -8);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

//        list.sort(null); // calls the default comparator, which will eventually lead to classcastexcetpion cuz student is custom
        // using explicit inner class Comparator
        list.sort(new comp());

       Student.printList(list);

        // or by implementing comparator thru anonymous inner class
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.marks, o1.marks);
            }
        });


       Student.printList(list);
       // or maybe by using a simple lambda comparator function
        list.sort((a,b) -> a.name.compareTo(b.name));
        Student.printList(list);

        // iterating over a list using iterator

        Iterator<Student> itr = list.iterator();
        System.out.println();
          // removes the element at the current pointer

//        itr.remove(); gives error
        for(; itr.hasNext(); ){
            Student student = itr.next();
            System.out.println("id : " + student.id + " Name :" + student.name + " Marks: " + student.marks);
            itr.remove();
        }
        // empties the entire list, always use itr.remove after the next() has been called, itr removes the last element returned by the next(), basically it remembers the last element

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        // iterating over list with the help op iterable

        // also an example of upcasting
        Iterable<Student> iterable = list;
        iterable.forEach(a-> System.out.println(a.name));

        //iterating over list using listLiterator
        System.out.println("*********************************8");

        ListIterator<Student>  itr2 = list.listIterator();
        while(itr2.hasNext()){
            Student student = itr2.next();
            System.out.println("id : " + student.id + " Name :" + student.name + " Marks: " + student.marks);
        }
        System.out.println("*********************************8");
        while(itr2.hasPrevious()){
            Student student = itr2.previous();
            System.out.println("id : " + student.id + " Name :" + student.name + " Marks: " + student.marks);
        }

        itr2.forEachRemaining(student -> System.out.println(student.name));

        // if our class doesnt implement the comparable, then giving a null will give us classcast exception
        // but in this case since we have impemented a compareto using comparable it will be used for comparison
//        list.sort(null);
        Collections.sort(list); // even this works the same now
        Student.printList(list);
    }

}
