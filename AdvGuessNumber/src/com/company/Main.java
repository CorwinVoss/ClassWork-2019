package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    //Things I want to use in all functions
    public static Scanner scanner = new Scanner(System.in);
    public static String prompt = "Please enter a number between 1 and 100";
    public static int secretNumber = GenerateNumber();

    public static void main(String[] args) {
        //gets name
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        String keepPlaying = "yes";
        //game loop
        while (keepPlaying.equalsIgnoreCase("yes")) {
            boolean correct = false;
            int count = 1;
            int userGuess = 0;
            secretNumber = GenerateNumber();
            //repeats while the guess is not correct
            while (!correct) {
                while (true) {
                    userGuess = 0;
                    userGuess = GetGuess();
                    if (userGuess == -1) {

                    }else {
                        break;
                    }
                }

                    correct = CheckGuess(secretNumber, userGuess);

                    printHint(secretNumber, userGuess);
                    count++;
                }
                //ends the game when they guess the correct number
                correct(name, count, secretNumber);

                //asks if they want to keep playing
                System.out.println("Do you want to keep playing?");
                keepPlaying = scanner.nextLine();
                //runs loop again if they enter yes
            }
        }
    //inputs the user input
     public static String Input(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
    //converts the user input into an integer
    public static int IntInput() {
        String userInput = Input(prompt);
        int userInt = 0;
        try {
            userInt = Integer.parseInt(userInput);
        } catch (NumberFormatException ex){
            System.out.println("Please enter a number");
            userInt = GetGuess();
        }
        return userInt;
    }
    //generates the number that the user has to guess
    public static int GenerateNumber(){
        Random random = new Random();
        int randNum = random.nextInt(100);
        return randNum;
    }
    //gets the guess from the user and checks to see if it is a guess that fits test cases
    public static int GetGuess(){
        int userInput = IntInput();
        while (true) {
            if (userInput >= 1 && userInput <= 100) {
                return userInput;
            } else {
                userInput = GetGuess();
            }

        }
    }
    //prints a hint for if the guess is higher or lower than the guess the user enters
    public static void printHint(int secretNumber, int userGuess) {
        if (secretNumber != userGuess) {
            if (secretNumber > userGuess) {
                System.out.println("Your guess was too low.");
            } else if (secretNumber < userGuess){
                System.out.println("Your guess was too high.");
            }
        }
    }
    //checks the guess the user entered to see if it is equal to the random number that they are supposed to guess
    public static boolean CheckGuess(int secretNumber, int userGuess){
        boolean correct = false;
        if (secretNumber != userGuess){
            if (secretNumber > userGuess){
                correct = false;
            }
        }
        else if(secretNumber == userGuess){
            correct = true;
        }
        return correct;
    }
    //when they are correct it runs and prints out the info from the game
    public static void correct(String name, int count, int secretNumber){
        System.out.println("Congratulations! " + name + " you did it in " + count + " guesses!");
        System.out.println("The correct number was " + secretNumber);
    }
}
