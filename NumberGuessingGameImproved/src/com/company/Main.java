package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println();
        int guess = 0;
        Scanner sc = new Scanner(System.in);
        NumberGame game = new NumberGame();
        System.out.println("I have selected a number between 0 and " +
                game.getUpperLimit());
        System.out.println();

        System.out.print("Enter your guess: ");
        while (true) {
            try {
                guess = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex){
                System.out.println("Invalid number");
            }
            if (guess <= 0 || guess >= game.getUpperLimit()){
                System.out.println("Please enter a number in between 0 and " + game.getUpperLimit());
            } else {
                if (guess < game.getNumber()) {
                    System.out.println("Your guess is too low.\n");
                } else if (guess > game.getNumber()) {
                    System.out.println("Your guess is too high.\n");
                } else if (guess > 10 + game.getNumber()) {
                    System.out.println("Way too high!");
                }else {
                    break;
                }
            }



            game.incrementGuessCount();
        }
        System.out.println("Correct!\n");

        if(game.getGuessCount() <= 3){
            System.out.println("Great work! You are a mathematical wizard.");
        } else if (game.getGuessCount() > 3 && game.getGuessCount() <= 7){
            System.out.println("Not too bad! You've got some potential.");
        } else if (game.getGuessCount() > 7){
            System.out.println("What took you so long? Maybe you should take some lessons");
        }

        System.out.println("You guessed the correct number in " +
                game.getGuessCount() + " guesses.\n");
        System.out.println("Bye!");
    }
}