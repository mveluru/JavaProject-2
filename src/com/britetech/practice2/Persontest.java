package com.britetech.practice2;

import java.util.stream.Stream;

public class Persontest {

    static Person getPerson(){
      Person p3 = new Person("Murali");
        return p3;
    }

    public static void main(String[] args) {
        Person p1 = new Person("John");
        Person p2 = new Person("Jahn");
        Person p4 = Stream.of(p1,p2).findAny().orElse(getPerson());
        System.out.println(p4.name);

        float add = 4L/2;
        System.out.println( add);
    }
}
