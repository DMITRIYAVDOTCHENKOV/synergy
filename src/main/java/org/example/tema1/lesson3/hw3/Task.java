package org.example.tema1.lesson3.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

//        extracted2();
//        extracted3();
//        extracted4();
//        extracted5();
//        extracted6();
//        extracted7();
//        extracted8();
//        extracted9();
//        extracted10();
//        extracted11();
//        extracted12();
//        extracted13();

    }

    private static void extracted13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведущий введите строку");
        String str1 = scanner.nextLine();
        System.out.println("Игрок 1 введите первое число ");
        int number1 = scanner.nextInt();
        System.out.println("Игрок 1 введите второе число ");
        int number2 = scanner.nextInt();
        System.out.println("Игрок 2 введите первое число ");
        int number3 = scanner.nextInt();
        System.out.println("Игрок 2 введите второе число ");
        int number4 = scanner.nextInt();
        String result1 = str1.substring(number1, number2);
        String result2 = str1.substring(number3, number4);
        if (result2.length() > result1.length()){
            System.out.println(result1 + " > " + result2);
            System.out.println("Игрок 2 победил");
        }else {
            System.out.println(result2 + " > " + result1);
            System.out.println("Игрок 1 победил");
        }
    }

    private static void extracted12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку");
        String str3 = scanner.nextLine();
        int strMin = str1.length();
        if (str2.length() < strMin && str2.length() < str3.length()) {
            strMin = str2.length();
        } else if (str3.length() < strMin) {
            strMin = str3.length();
        }
        System.out.println(strMin);

        System.out.println(str1.substring(0,strMin));
        System.out.println(str2.substring(0,strMin));
        System.out.println(str3.substring(0,strMin));
    }

    private static void extracted11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number1 = ");
        int number1 = scanner.nextInt();
        System.out.println("number2 = ");
        int number2 = scanner.nextInt();
        System.out.println("number3 = ");
        int number3 = scanner.nextInt();
        int[] num = {number1, number2, number3};
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0 && num[i] % 2 >= 0) {
                System.out.println("Четное число " + num[i]);
            }
            if (num[i] < 0) {
                System.out.println("Число отрицательное " + num[i]);
            }
            if (num[i] > 1000) {
                System.out.println("Число больше 1000 " + num[i]);
            }
        }
    }

    private static void extracted10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите troe || false");
        boolean str = sc.nextBoolean();
        if (str == true) {
            System.out.println(str);
        }
    }

    private static void extracted9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку");
        String str1 = scanner.nextLine();
        System.out.println(str1.substring(0, 5));
    }

    private static void extracted8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = sc.nextInt();
        System.out.println("Введите первое число");
        int number2 = sc.nextInt();
        if (number1 < number2) {
            System.out.println(number1 / number2);
        } else {
            System.out.println(number2 / number1);
        }
    }

    private static void extracted7() {
        String str = "Hell";
        while (str.length() < 10) {
            str = str + "o";
        }
        //6
    }

    private static void extracted6() {
        int x = 1;
        while (x >= -3) {
            System.out.print(x);
            x = x - 1;
        }
        // 6 раз
    }

    private static void extracted5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое дробное число");
        double number1 = scanner.nextDouble();
        System.out.println("Введите второе дробное число");
        double number2 = scanner.nextDouble();
        System.out.println("Введите третье дробное число");
        double number3 = scanner.nextDouble();
//        System.out.println(Math.sqrt(number1));
//        System.out.println(Math.sqrt(number2));
//        System.out.println(Math.sqrt(number3));
        if (Math.sqrt(number1) < 2) {
            System.out.println(number1);
        }
        if (Math.sqrt(number2) < 2) {
            System.out.println(number2);
        }
        if (Math.sqrt(number3) < 2) {
            System.out.println(number3);
        }
    }

    private static void extracted4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку");
        String str3 = scanner.nextLine();
        if (str1.length() != str2.length() && str1.length() != str3.length()) {
            if (str1.length() < str2.length() && str1.length() < str3.length()) {
                System.out.println("Строка № 1 самая коротка");
            } else if (str2.length() < str1.length() && str2.length() < str3.length()) {
                System.out.println("Строка № 2 самая коротка");
            } else {
                System.out.println("Строка № 3 самая коротка");
            }
        }
        System.out.println("Строки равны");
    }

    private static void extracted3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строчку");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строчку");
        String str2 = scanner.nextLine();
        int result = str1.length() + str2.length();
        System.out.println("Сумма двух строк = " + result + " символов");
    }

    private static void extracted2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        System.out.println("Длина вашей строки : " + str.length() + " симфолов");
    }
}
