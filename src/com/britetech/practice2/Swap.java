package com.britetech.practice2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Swap {

    public static void main(String[] args) {
        List<Character> list1 = new ArrayList<>();
        list1.add('B');
        list1.add('Z');
        list1.add('F');
        list1.add('E');
        list1.add('F');
        list1.add('K');
        list1.add('A');
        List<Character> list2 = new ArrayList<>();
        for (Character character : list1) {
            list2.add(character);
        }
        list2.sort((character, anotherCharacter) -> character.compareTo(anotherCharacter));
        System.out.println(list2);


    }
}
