package com.company;

/**
 * Created by cv1900 on 3/28/2019.
 */
public class Cat {
    String species;
    String name;

    public Cat(String name){
        species = "Cat";
        this.name = name;
    }

    public void makeSound(){
        System.out.println("Meow");
    }

    public void printName(){
        System.out.println(name);
    }

    public void beHappy(){
        System.out.println("Purrrr");
        seeLaser();
        makeSound();
    }

    public void seeLaser(){
        System.out.println("*cat punces*");
    }
}
