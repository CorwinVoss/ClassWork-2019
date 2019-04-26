package com.company;

/**
 * Created by cv1900 on 3/28/2019.
 */
public class Dog {
    String species;
    String name;
    boolean dockedTail;

    public Dog(String name, boolean dockedTail){
        species = "Dog";
        this.name = name;
        this.dockedTail = dockedTail;
    }

    public void makeSound(){
        System.out.println("Woof");
    }

    public void printName(){
        System.out.println(name);
    }

    public void playFetch(){
        System.out.println("*chases ball 5 times then quits*");
    }

    public boolean getDockedTail(){
        dockedTail = true;
        return true;
    }
}
