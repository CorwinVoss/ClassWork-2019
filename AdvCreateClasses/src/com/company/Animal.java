package com.company;

/**
 * Created by cv1900 on 3/28/2019.
 */
public class Animal {
    //properties
    String species;
    String name;

    public Animal(String species, String name){
        this.species = species;
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Grrr");
    }

    public void printName(){
        System.out.println(name);
    }
}
