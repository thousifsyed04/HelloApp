package com.bridgelabz;

import java.util.Scanner;

public class HelloApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of names: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Hello " + name);
        }
    }
}