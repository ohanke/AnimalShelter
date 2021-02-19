package com.company;

import java.util.ArrayList;

public class Shelter {
    private String shelterName;
    private final int shelterCapacity;
    private Animal animal;
    private ArrayList<Animal> animalList = new ArrayList<>();

    public Shelter(String shelterName, int shelterCapacity) {
        this.shelterName = shelterName;
        this.shelterCapacity = shelterCapacity;
    }

    public void addAnimal(String name, int age, String race){
        animalList.add(new Animal(name, age, race));
        System.out.println("Place for " + (shelterCapacity - animalList.size() + " animals left"));
    }

    public boolean canAddAnimal(){
        return animalList.size() < shelterCapacity;
    }

    public void removeAnimal(int animalId){
        int index = -1;
        for (Animal animal : animalList) {
            if (animal.getId() == animalId)
                index = animalList.indexOf(animal);
        }
        if (index == -1)
            System.out.println("Error");
        else
            animalList.remove(index);
    }

    public void printAnimals(){
        if (animalList.isEmpty())
            System.out.println("There are no animals in this shelter.");
        else{
            for (Animal animal : animalList) {
                System.out.println("ID: " + animal.getId()
                        + ", Name: " + animal.getName()
                        + ", Age: " + animal.getAge()
                        + " , Race: " + animal.getRace());
            }
        }
    }

    public void printShelterStatus(){
        System.out.println("Shelters maximum capacity: " + shelterCapacity + ".");
        System.out.println("Current amount of animals: " + animalList.size());
    }

}
