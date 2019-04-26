package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String keepUsing = "y";
        while (keepUsing.equals("y")) {
            int input1 = 0;
            String inputSign = "";
            int input2 = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("First Number: ");
            try {
                input1 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a real number.");
            }
            System.out.println("What would you like to do? (+,-,/,*)");
            inputSign = scanner.nextLine();
            System.out.println("Second Number: ");
            try {
                input2 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a real number.");
            }
            if (inputSign.equals("+")) {
                input1 += input2;
                System.out.println(input1);
            } if (inputSign.equals("-")){
                input1 -= input2;
            } if (inputSign.equals("/")) {
                input1 /= input2;
            } if (inputSign.equals("*") || inputSign.equals("x")){
                input1 *= input2;
            }
            System.out.println("Equals: " + input1);

            System.out.println("Would you like to keep using this program (y/n)");
            keepUsing = scanner.nextLine();
        }
    }
}
