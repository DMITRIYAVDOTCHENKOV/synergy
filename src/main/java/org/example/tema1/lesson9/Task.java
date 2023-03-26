package org.example.tema1.lesson9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
//        extracted();
        InputStream stream = new FileInputStream("test.txt");
        Scanner scan = new Scanner(stream);
        int x = scan.nextInt();
        char op = scan.next().charAt(0);
        int y = scan.nextInt();

        PrintWriter writer = new PrintWriter("out.txt");
        if (op == '*'){
            writer.println("result");
            writer.println("is ...");
            writer.println(x * y);
            writer.close();
//            System.out.println(x * y);
        }
//        String str1 = scan.nextLine();
//        String str2 = scan.nextLine();
//
//        System.out.println("str1= " + str1);
//        System.out.println("str2= " + str2);

    }

    private static void extracted() throws IOException {
        char x = (char) System.in.read();
        char operator = (char) System.in.read();
        char y = (char) System.in.read();
        int xValue = x - 48;
        int yValue = y - 48;

        System.out.print("=");
        if (operator == '+') {
            System.out.println(xValue + yValue);
        } else if (operator == '-') {
            System.out.println(xValue - yValue);
        } else if (operator == '*') {
            System.out.println(xValue*yValue);
        }else if(operator =='/'){
            if (yValue > 0){
                System.out.println(xValue / yValue);
            }else {
                System.err.println("На ноль не делим");
            }
        }
    }
}
