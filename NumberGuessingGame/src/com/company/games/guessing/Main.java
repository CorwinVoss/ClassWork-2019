package com.company.games.guessing;

import com.company.games.guessing.business.NumberGame;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit for the number: ");
        NumberGame game = new NumberGame();

        System.out.println();
        System.out.println("OK, I'm thinking of a number between 0 and " + game.getUpperLimit());
        System.out.println();

        System.out.print("Enter your guess: ");
        boolean loop = true;
        int firstGuess = scanner.nextInt();
        if (firstGuess > game.getNumber()){
            System.out.println("Your guess was too high.");
        } else if(firstGuess < game.getNumber()){
            System.out.println("Your guess was too low.");
        }
        else{
            System.out.println("Correct!");
            loop = false;
        }
        int newGuess = -1;

        while (firstGuess != game.getNumber() || newGuess != game.getNumber() || loop){
            System.out.println();
            System.out.print("Enter your guess: ");
            newGuess = scanner.nextInt();
            game.incrementGuessCount();
            if (newGuess > game.getNumber()){
                System.out.println("Your guess was too high.");
            }else if(newGuess < game.getNumber()){
                System.out.println("Your guess was too low.");
            }
            if(newGuess == game.getNumber()){
                break;
            }
        }
        System.out.println("Correct!");
        System.out.println("You took " + game.getIntGuesses() + " guesses.");

        System.out.println();
        System.out.println("Bye!");
    }
}

