package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String username = " ";
        String password = " ";
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();

        while (true) {
            System.out.println("Would you like to login or create an account?");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("login")) {
                System.out.println("Enter Username: ");
                username = scanner.nextLine();
                System.out.println("Enter Password: ");
                password = scanner.nextLine();
                for (int i = usernames.size() - 1; i >= 0; i--) {
                    if (usernames.get(i).equalsIgnoreCase(username)) {
                        if (passwords.get(i).equalsIgnoreCase(password)) {
                            System.out.println("Welcome, " + username);
                            System.exit(0);
                        } else {
                            System.out.println("Sorry, the account does not match records");
                        }
                    }
                }
            } else if (input.equalsIgnoreCase("create account") || input.equalsIgnoreCase("create an account") || input.equalsIgnoreCase("create")) {
                System.out.println("Enter Username: ");
                username = scanner.nextLine();
                System.out.println("Enter Password: ");
                password = scanner.nextLine();
                usernames.add(username);
                passwords.add(password);

            }
        }
    }
}


