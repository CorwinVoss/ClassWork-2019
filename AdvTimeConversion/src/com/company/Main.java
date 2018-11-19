package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int hour = 0;
        int min = 0;
        int sec = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hour for 12 hr time format: ");

        try {
            hour = Integer.parseInt(scanner.next());
        } catch (NumberFormatException ex){
            System.out.println("Please enter a real number");
            System.exit(0);
        }

        if (hour > 12 || hour <= 0){
            System.out.println("Please enter a proper time");
            System.exit(0);
        }

        System.out.println();
        System.out.print("Enter minute for 12 hr time format: ");

        try {
            min = Integer.parseInt(scanner.next());
        } catch (NumberFormatException ex){
            System.out.println("Please enter a real number");
            System.exit(0);
        }

        if (min >= 60 || min < 0){
            System.out.println("Please enter a proper time");
            System.exit(0);
        }

        System.out.println();
        System.out.print("Enter sec for 12 hr time format: ");

        try {
            sec = Integer.parseInt(scanner.next());
        } catch (NumberFormatException ex){
            System.out.println("Please enter a real number");
            System.exit(0);
        }

        if (sec >= 60 || sec < 0){
            System.out.println("Please enter a proper time");
            System.exit(0);
        }

        System.out.println();
        System.out.print("Enter AM/PM: ");
        String timeOfDay = scanner.next();
        System.out.println();

        if (timeOfDay.equalsIgnoreCase("am")){
            if (hour == 12){
                hour -= 12;
            }
        }
        else if (timeOfDay.equalsIgnoreCase("pm")){
            if (hour != 12){
                hour += 12;
            }
        } else {
            System.out.println("Please enter am or pm.");
            System.exit(0);
        }

        System.out.print("The time is: ");
        System.out.printf("%02d", hour);
        System.out.print(":");
        System.out.printf("%02d", min);
        System.out.print(":");
        System.out.printf("%02d", sec);
    }
}