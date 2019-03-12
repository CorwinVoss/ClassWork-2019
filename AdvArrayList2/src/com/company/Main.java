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
        System.out.println("Would you like to login or create an account?");
        while (true) {
            if (scanner.nextLine().equalsIgnoreCase("login")) {
                System.out.println("Enter Username: ");
                System.out.println("Enter Password: ");
                for (int i = usernames.size(); i <= 0; i--){
                    if (username.equalsIgnoreCase(usernames.get(i))){
                        break;
                    }
                }
            } else if (scanner.nextLine().equalsIgnoreCase("create account")) {
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
