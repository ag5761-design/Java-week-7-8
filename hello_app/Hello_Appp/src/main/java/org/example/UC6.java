package org.example;

public class HelloApp {
    public static void main(String[] args) {

        // Case 1: No arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use StringBuilder for efficient string concatenation
            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop to process all arguments
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", " using substring
            if (nameBuilder.length() > 0) {
                String names = nameBuilder.substring(0, nameBuilder.length() - 2);
                System.out.println("Hello, " + names + "!");
            }
        }
    }
}

