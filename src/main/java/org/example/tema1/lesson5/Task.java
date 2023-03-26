package org.example.tema1.lesson5;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
//        extracted();
//        extracted1();
//        double random = Math.random();
//        double randomBig = random * 33 + 1072;
//
//        int randomBigFloar = (int) Math.floor(randomBig);
//        char letter = (char) randomBigFloar;
//        System.out.println(letter);
//        System.out.println(randomBigFloar);
//        extracted2();
        int random = 5 + (int)(Math.random() * ((10 - 5) + 1));
        System.out.println(random);

    }

    private static void extracted2() {
        int letterCode = 1072;
        while (letterCode <= 1103) {
            char letter = (char) letterCode;
            System.out.println(letter);
            letterCode++;
        }
    }

    private static void extracted1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter math expression");
        double x = scanner.nextDouble();
        char operation = scanner.next().charAt(0);
        double y = scanner.nextDouble();

        if (operation == '+'){
            System.out.println(x + y);
        }
        if (operation == '-'){
            System.out.println(x - y);
        }
        if (operation == '*'){
            System.out.println(x * y);
        }
        if (operation == '/'){
            System.out.println(x / y);
        }
    }

    private static void extracted() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
