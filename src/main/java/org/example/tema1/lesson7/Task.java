package org.example.tema1.lesson7;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean x = str.contains(".");
        if (x) {
            System.out.println("There is a symbols");
        } else if (str.contains("!")) {
            System.out.println("There is a symbols");
        } else if (str.contains("?")) {
            System.out.println("There is a symbols");
        }else {
            System.out.println("There is no symbols");
        }
    }
}

