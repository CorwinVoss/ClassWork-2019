package com.company;

/**
 * Created by cv1900 on 3/28/2019.
 */
public class RussianBlue {
    String species;
    String name;

    public RussianBlue(String name){
        species = "cat";
        this.name = name;
    }

    public void makeSound(){
        System.out.println("Hisss");
    }

    public void beHappy(){
        System.out.println("Purrrr");
        seeLaser();
    }

    public void seeLaser(){
        System.out.println("*cat pounces*");
    }
}
