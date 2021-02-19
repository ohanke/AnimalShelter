package com.company;

public class Animal {
    static int countAnimals = 0;

    private String name;
    private int age;
    private String race;
    private int id;

    public Animal(String name, int age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
        countAnimals++;
        this.id = countAnimals;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public int getId() {
        return id;
    }
}
