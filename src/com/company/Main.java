package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shelter shelter = new Shelter("Animal Shelter 3000", 3);
        boolean exit = false;

        while(!exit){
            printOptions();
            System.out.println("\nEnter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            switch (number){
                case 1:
                    shelter.printAnimals();
                    break;
                case 2:
                    shelter.printShelterStatus();
                    break;
                case 3:
                    if (!shelter.canAddAnimal()){
                        System.out.println("Error! Shelter is full!");
                        break;
                    }
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Race: ");
                    String race = scanner.nextLine();
                    shelter.addAnimal(name, age, race);
                    break;
                case 4:
                    System.out.println("Enter the animals ID: ");
                    int animalId = scanner.nextInt();
                    shelter.removeAnimal(animalId);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }

    public static void printOptions(){
        System.out.println("\n1 - Print animal list");
        System.out.println("2 - Print shelter status: ");
        System.out.println("3 - Add a new animal");
        System.out.println("4 - Remove an animal");
        System.out.println("5 - Exit program");
    }
}
