package com.company;

import java.util.Random;
import java.util.Scanner;


public class Player {

    private int  health;
    private int defense;
    private int attack;
    private int playerLevel;
    private int healthPotions;

    public int getXp() {
        return xp;
    }

    private int xp;

    Random rand;

    //constructor that will initialize the instance variables (properties)
    //the "this" key word refers to the object's variable instead of the function's input
    //in the case that they have the same name.
    public Player(){
        rand = new Random();
        this.playerLevel = 1;
        health = 50;
        defense = 10;
        attack = 10;
        healthPotions=0;
    }

    //getters (allow the programmers to see the values of the instance variables
    public int getHealth() {
        return health;
    }

    private int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    //used to get input from the user will allow them to see stats use heal or attack
    public void menu(Enemy enemy){
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("What would you like to do? heal or attack or stats or exit");

            String answer = console.nextLine();
            if (answer.equalsIgnoreCase("heal")) {
                heal();
            } else if (answer.equalsIgnoreCase("attack")) {
                return;  //exits out and attacks
            } else if (answer.equalsIgnoreCase("stats")) {
                System.out.println("your stats:");
                System.out.println("level:   " + getPlayerLevel());
                System.out.println("health:  " + getHealth());
                System.out.println("attack:  " + getAttack());
                System.out.println("defense: " + getDefense());
                System.out.println("potions: " + healthPotions);
                System.out.println();
                System.out.println("enemy stats:");
                System.out.println("health:  " + enemy.getHealth());
                System.out.println("attack:  " + enemy.getAttack());
                System.out.println("defense: " + enemy.getDefense());
            } else if (answer.equalsIgnoreCase("exit")){
                System.out.println("Are you sure?");
                String exit = console.nextLine();
                if (exit.equalsIgnoreCase("yes")) {
                    System.exit(0);
                }
            }
        }
    }

    //this is the function that allows the player to take damage
    //returns true if player is alive
    public boolean takeDamage(Enemy enemy){
        int damage = (rand.nextInt(enemy.getAttack())+enemy.getAttack()) - defense;
        if (damage<1){
            damage = 1;
        }
        health = health -damage;
        System.out.println("the enemy attacked you and you took: " + damage+ " damage!");
        if(isAlive()){
            return  true;
        }
        System.out.println("you died.");
        return false;
    }

    //returns true if the player health>0
    private boolean isAlive(){
        return (health>0);
    }

    //call to use a health potion
    private void heal(){
        int amount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have " + healthPotions + " potions");
        System.out.println("How many health potions do you want to use");
        try {
            amount = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException ex){
            System.out.println("Please use a real number");
            heal();
        }
        if(healthPotions >0){
            healthPotions -= amount;
            health += 50 * amount;
            System.out.println("you drank " + amount + "  potion(s) and restored " + amount * 50 + " health, you now have "+health+" health");
        }
        else{
            System.out.println("you have no health potions");
        }
    }

    //call when player kills an enemy (should not need to be called in main
    public void gainXP(int multiplier){
        int randPots = rand.nextInt(10);
        if (multiplier == 1){
            xp++;
        } else{
            xp *= multiplier;
        }

        //if they leveled up
        if (xp>(int) (5*Math.pow(1.3,playerLevel))){
            playerLevel++;
            System.out.println("You are now level: " + playerLevel);
            System.out.println("You got " + randPots + " health potions");
            healthPotions += randPots;
            attack = attack +rand.nextInt(7)+1;
            defense = defense + rand.nextInt(7)+1;
        }
    }

    //if they find the chest
    public void chestFound(){
        healthPotions += 10;
        attack = getAttack() + 25;
        defense = getDefense() + 25;
        health = getHealth() + 25;
    }
}
