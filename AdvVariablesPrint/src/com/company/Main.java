package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int var1 = 5;
        int var2 = 6;
        int var5 = var1 * var2;
        System.out.println(var5);
        var1++;
        var1 += 3;
        System.out.println(var1);
        var1 = 7;
        var2 -= var1;
        System.out.println(var2);
        var1 = 12;
        var1 += 7;
        System.out.println(var1);
        var5 = (var1 * var2) - var1;
        System.out.println(var5);
        int var3 = 8;
        var5 = var1 + var2 + var3;
        System.out.println(var5);
        var5 /= var3;
        System.out.println(var5);
        int var4 = 9;
        var3 = var4 - var3;
        System.out.println(var3);
        var5 *= var3;
        System.out.println(var5);
        var5 += var5;
        var5 /= 3;
        System.out.println(var5);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("hi")){
            System.out.println("hi");
        }
    }
}
