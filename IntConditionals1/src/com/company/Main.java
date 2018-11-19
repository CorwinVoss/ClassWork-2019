package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Download Speed(MB/s): ");
        double downloadSpeed = Double.parseDouble(scanner.next());
        System.out.println();
        System.out.print("Enter file size: ");
        double fileSize = Double.parseDouble(scanner.next());
        if (fileSize < 0){
            System.out.println("Enter a usable number");
            System.exit(0);
        }
        System.out.println();
        System.out.print("Enter: KB, MB or GB: ");
        String fileType = scanner.next();
        System.out.println();
        switch (fileType) {
            case "KB":
                fileSize = fileSize / 1000;

            case "GB":
                fileSize = fileSize * 1000;

            case "MB":
                fileSize = fileSize;

            default:
                System.out.println("Please enter KB, MB or GB");
                System.exit(0);
        }
            System.out.println(fileSize/downloadSpeed + " seconds");
        }
    }

