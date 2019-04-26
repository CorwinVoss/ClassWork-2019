package com.company;

/**
 * Created by cv1900 on 3/28/2019.
 */
public class OrangeTabby {
    String species;
    String name;

    public OrangeTabby(String name){
        this.name = name;
        species = "Cat";
    }

    public void makeSound(){
        System.out.println("Meow");
    }

    public void printName(){
        System.out.println(name);
    }

    public void beHappy(){
        layOnLap();
        System.out.println("*takes nap*");
    }

    public void layOnLap(){
        System.out.println("*cuddles on owner's lap*");
    }

    public void seeLaser(){
        System.out.println("*cat pounces*");
    }
}
