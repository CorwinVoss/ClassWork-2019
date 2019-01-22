package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        print(enter first number)
        firstInput = input
        print(enter second number)
        secondInput = input

        while (firstInput < secondInput){
        notPrime = false
        for (int i = 2; i <= firstInput; i++){
        if (firstInput % i == 0){
        notPrime = true
        break
          }
        }
        if(!notPrime){
        print(first input)
        }
        }
         */
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
        int extra = 0;
        System.out.println();
        if (secondInput < firstInput){
            extra = secondInput;
            secondInput = firstInput;
            firstInput = extra;
        }

        while (firstInput <= secondInput){
            boolean notPrime = false;
            for (int i = 2; i <= firstInput / 2; i++) {
                if (firstInput % i == 0) {
                    notPrime = true;
                    break;
                }
            }
                if (!notPrime && firstInput != 1 && firstInput > 0){
                    System.out.println(firstInput);
                }
            firstInput++;
        }
    }
}
