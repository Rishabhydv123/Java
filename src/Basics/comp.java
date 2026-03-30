package Basics;

import java.util.*;

class Human implements Comparable<Human> {
    int age;
    String name;

    // Constructor
    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int compareTo(Human h1) {
        return Integer.compare(this.age, h1.age);
    }
}

public class comp {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>();

        list.add(new Human(22, "Rishabh"));
        list.add(new Human(32, "Aman"));
        list.add(new Human(22, "Deepak"));
        list.add(new Human(42, "Abhishek"));
        list.add(new Human(15, "APl"));

        Collections.sort(list);
        for (Human h : list) {
            System.out.println(h.age + " " + h.name);
        }
    }
}