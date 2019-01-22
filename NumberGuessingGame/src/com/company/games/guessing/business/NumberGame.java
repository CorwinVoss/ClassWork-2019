package com.company.games.guessing.business;

import java.util.Random;

/**
 * Created by cv1900 on 10/12/2018.
 */
public class NumberGame {
    private int upperLimit;
    private int number;
    private int intGuesses;

    public NumberGame(){
        this(50);
    }

    public NumberGame(int upperLimit){
        this.upperLimit = upperLimit;
        intGuesses = 1;
        Random random = new Random();
        number = random.nextInt(upperLimit - 1) + 1;
    }

    ///gets the number to guess
    public int getNumber() {
        return number;
    }

    ///gets the amount guesses
    public int getIntGuesses(){
        return intGuesses;
    }

    ///gets the upper limit
    public int getUpperLimit()  {
        return upperLimit;
    }

    ///adds one to the guesses
    public void incrementGuessCount() {
        intGuesses++;
    }
}
