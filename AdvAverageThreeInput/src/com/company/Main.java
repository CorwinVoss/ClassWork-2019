package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Three number average calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double input1 = Double.parseDouble(scanner.nextLine());
        if (input1 >= 0 || input1 <= 0){
        } else{
            System.out.println("Please enter a number!");
        }
        System.out.println();
        System.out.print("Enter another number: ");
        double input2 = Double.parseDouble(scanner.nextLine());
        System.out.println();
        if (input2 >= 0 || input2 <= 0){
        }else {
            System.out.println("Please enter a number");
        }
        System.out.print("Enter a third number: ");
        double input3 = Double.parseDouble(scanner.nextLine());
        System.out.println();
        if (input3 >= 0 || input3 <= 0){
        } else{
            System.out.println("Please enter a number!");
            System.exit(0);
        }
        System.out.println();
        System.out.println("The average is: " + ((input1 + input2 + input3) / 3));
    }
}
