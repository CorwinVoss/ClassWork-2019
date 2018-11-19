package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = 0;
        int secondInput = 0;
        System.out.print("Enter your first number: ");
        try {
            firstInput = Integer.parseInt(scanner.next());
        } catch (NumberFormatException ex){
            System.out.println("Please enter a number");
        }
        System.out.println();

        System.out.print("Enter your second number: ");
        try{
            secondInput = Integer.parseInt(scanner.next());
        }  catch (NumberFormatException ex){
            System.out.println("Please enter a number");
        }
        System.out.println();
        while (firstInput != secondInput){
            for (int i = 1; i <= firstInput / 2; i++){
                if (firstInput % i == 0){

                }
            }
            firstInput++;
        }
    }
}
