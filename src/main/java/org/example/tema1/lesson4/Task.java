package org.example.tema1.lesson4;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
//        extracted1();
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Float.MAX_VALUE);
//        char a =  'c';
//        System.out.println(a);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter char");
        char c = scanner.next().charAt(0);
        int charCode = c;
        if (charCode >= 48 && charCode <= 57) {
            System.out.println("this is a digit");
        } else {
            System.out.println("this is not a digit");
        }
    }
//        char value = '-';

//        while (charCode < 200) {
//            System.out.println(charCode + " " + value);
//            charCode = charCode + 1;
//            value = (char) charCode;


    private static void extracted1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter credit sum: ");
        int creditSum = scanner.nextInt();
        System.out.println("Please enter percent: ");
        double percent = scanner.nextDouble();
        System.out.println(creditSum + creditSum * (percent / 100));
    }
}
