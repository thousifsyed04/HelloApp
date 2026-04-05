package com.bridgelabz;

// Program to display Hello with multiple args using String.join() method
public class HelloApp {
    public static void main(String[] args) {
        // Declare greeting variable
        String greeting;

        // Check if arguments are provided
        if (args.length == 0) {
            // Set default greeting if no arguments provided
            greeting = "Hello, World!";
        } else {
            // Join all names with comma-space delimiter
            greeting = "Hello, " + String.join(", ", args) + "!";
        }

        // Display the greeting
        System.out.println(greeting);
    }
}