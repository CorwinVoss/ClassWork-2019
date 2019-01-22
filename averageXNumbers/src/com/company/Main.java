package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //average x numbers.

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers would you like to average?");
        double input1 = 0;
        try {
            input1 = Double.parseDouble(scanner.next());
        } catch (NumberFormatException ex){
            System.out.println("Please enter a number");
            System.exit(0);
        }
        if (input1 <= 0){
            System.out.println("Please enter a number greater than 0");
        }
        double total = 0;
        int i = 0;
        while (i < input1){
            System.out.println("Enter a number:");
            double temp = 0;
            try {
                temp = Double.parseDouble(scanner.next());
            } catch (NumberFormatException ex){
                System.out.println("Please enter a number");
                System.exit(0);
            }
            total += temp;
            i++;
        }

        System.out.println(total/input1);
    }
}
