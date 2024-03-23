package com.britetech.practice3;

public class DerivedFromBase extends  Base{

    @Override
    public void show() {
        System.out.println("Derived from Base Class");
    }

    @Override
    public void show1(String kk) {
        System.out.println("abc");
    }

    public static void main(String[] args) {
        DerivedFromBase b = new DerivedFromBase();
        b.show1("Hello");

    }
}
