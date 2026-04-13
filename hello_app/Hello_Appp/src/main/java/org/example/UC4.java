package org.example;

public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            String names = "";

            for (int i = 0; i < args.length; i++) {
                names = names + args[i];

                if (i != args.length - 1) {
                    names = names + ", ";
                }
            }

            System.out.println("Hello " + names);
        }
    }
}


