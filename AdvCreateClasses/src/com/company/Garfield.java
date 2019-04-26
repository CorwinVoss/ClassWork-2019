package com.company;

/**
 * Created by cv1900 on 3/28/2019.
 */
public class Garfield {
    String species;
    String name;

    public Garfield(){
        name = "Garfield";
        species = "Cat";
    }

    public void makeSound(){
        System.out.println("mmmm, lasagna");
    }

    public void printName(){
        System.out.println(name);
    }

    public void beHappy(){
        layOnLap();
        System.out.println("*takes a nap*");
    }

    public void layOnLap(){
        System.out.println("*cuddles on owner's lap*");
    }

    public void seeLaser(){
        beHappy();
    }
}
