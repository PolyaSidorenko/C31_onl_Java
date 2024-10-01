package Lesson15;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class AnimalNames{
    LinkedList<String> animalNames;


    public AnimalNames(LinkedList<String> animalNames){
        this.animalNames = animalNames;
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
    public void addName(){
        System.out.println("Введите название животного: ");
        animalNames.addFirst(getScanner().nextLine());
    }
    public void removeName(){
        animalNames.removeLast();
    }
    public void output(){
        System.out.println(animalNames);
    }
}
