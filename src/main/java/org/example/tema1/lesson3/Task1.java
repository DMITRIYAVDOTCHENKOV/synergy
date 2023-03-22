package org.example.tema1.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x : ");
        int x = scanner.nextInt();
        System.out.print("Введите y : ");
        int y = scanner.nextInt();
        int x1 = 10;        System.out.print("Введите x : ");
        int y1 = 56;

        if (x > y) {
            System.out.println("x is greater than y");
        }else {
            System.out.println("y is greater (or maybe equal) to x");
        }
    }
}
