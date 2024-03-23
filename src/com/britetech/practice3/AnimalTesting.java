package com.britetech.practice3;

public class AnimalTesting {

    public static void main(String args[]) {
        Animal a = new Animal();   // Animal reference and object
        // Dynamic Binding
        Animal b = new Dog();   // Animal reference but Dog object

        a.move();   // runs the method in Animal class
        b.move();   // runs the method in Dog class
    }
}
