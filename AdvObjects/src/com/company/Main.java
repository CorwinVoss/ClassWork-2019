package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //extra coded added
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

//most of this assignment is trying to read the existing code to understand how it works,
        //ask a classmate or instructor if you are unsure how the code works.
        String keepPlaying = "yes";

        //loop that asks if user wants to play again after the game is over
        while (keepPlaying.equalsIgnoreCase("yes")) {
            //generate a new player
            Player player = new Player();
            //create main game loop that continues until the player has no health
            while (player.getHealth() > 0) {
                int randInt = rand.nextInt(250);
                //generate a new enemy( the level of the enemy should be the player's level)
                Enemy enemy = new Enemy(player.getPlayerLevel());
                //create battle loop that should continue while both the player and enemy are alive
                while (player.getHealth() > 0 && enemy.getHealth() > 0) {
                    //gets player's input on what to do (use one of the methods to do this)
                    player.menu(enemy);
                    //has the enemy take damage
                    enemy.takeDamage(player);
                    //has the player take damage
                    player.takeDamage(enemy);
                }
                //player finds random chest
                if (randInt == 1){
                    System.out.println("You found a rare chest \n All stats +25 and 10 health potions");
                    //runs the chest found command which adds to stats and health potions
                    player.chestFound();
                }
            }
            //once the player is dead print out the player's level and how much xp they had.
            System.out.println("Your player was level " + player.getPlayerLevel() + " with " + player.getXp() + " xp.");

            //asks if the user wants to keep playing after they die
            System.out.println("Would you like to keep playing?");
            //input that runs the outermost loop
            keepPlaying = scanner.nextLine();
        }
    }
}