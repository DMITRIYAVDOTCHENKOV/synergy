package org.example.tema1.lesson6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


//        extracted();
//        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.nextLine();
//        if (str1.contains(" ")) {
//            System.out.println("You entered multiple words");
//        }else {
//            System.out.println("You entered one words");
//        }
    }

    private static void extracted() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x: ");
        int x = scanner.nextInt();
        System.out.println("y: ");
        int y = scanner.nextInt();
        System.out.println("z: ");
        int z = scanner.nextInt();
        System.out.println("Max is: ");
        if (x > y) {
            if (x > z) {
                System.out.println(x);
            } else {
                System.out.println(z);
            }
        } else if (y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}
