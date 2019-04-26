package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = " ";
        String password = " ";
        boolean check = true;
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        while (true) {
            while (true) {
                System.out.println("Would you like to login or create an account?");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("login")) {
                    System.out.println("Enter Username: ");
                    username = scanner.nextLine();
                    System.out.println("Enter Password: ");
                    password = scanner.nextLine();
                    for (int i = usernames.size() - 1; i >= 0; i--) {
                        if (usernames.get(i).equalsIgnoreCase(username) && passwords.get(i).equalsIgnoreCase(password)) {
                            System.out.println("Welcome, " + username);
                            System.exit(0);
                        } else {
                            System.out.println("Sorry, that account does not match records");
                        }
                    }
                } else if (input.equalsIgnoreCase("create account") || input.equalsIgnoreCase("create an account") || input.equalsIgnoreCase("create")) {
                    System.out.println("Enter Username: ");
                    username = scanner.nextLine();
                    for (int i = usernames.size() - 1; i >= 0; i--) {
                        if (usernames.get(i).equals(username) && usernames.size() > 0) {
                            System.out.println("This username already exists");
                            check = false;
                            break;
                        } else {
                            check = true;
                        }
                    }
                    if (!check) {
                        break;
                    }
                    if (usernames.size() == 0) {
                        usernames.add(username);
                    }
                    System.out.println("Enter Password: ");
                    password = scanner.nextLine();
                    passwords.add(password);
                }
            }
        }
    }
}