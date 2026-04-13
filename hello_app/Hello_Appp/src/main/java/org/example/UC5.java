package org.example;

public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder sb = new StringBuilder();

            for (String name : args) {
                sb.append(name).append(", ");
            }

            sb.setLength(sb.length() - 2);

            System.out.println("Hello, " + sb.toString() + "!");
        }
    }
}


