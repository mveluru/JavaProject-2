package com.britetech.practice3;

public abstract class Base {
    public void show(){
        System.out.println("Base Class");
    }

    public void show1() {
        System.out.println("Derived from Base Class");
    }

    public abstract void show1(String kk);
}
