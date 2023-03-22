package org.example.tema1.lesson2.hm;

import org.w3c.dom.Document;

import javax.swing.text.Element;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
//        URL website = new URL("http://www.website.com/information.asp");
//        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
//        FileOutputStream fos = new FileOutputStream("information.html");
//        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
//        extracted1();
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
//        extracted14();
//        extracted15();
//        extracted16();
        extracted17();
        extracted18();
        extracted19();
        extracted20();
    }

    private static void extracted20() {
    }

    private static void extracted19() {
    }

    private static void extracted18() {
    }

    private static void extracted17() throws IOException {
        String url = "https://ru.wikipedia.org/wiki/Проблема_2000_года"; // URL статьи
        String fileName = "article.txt"; // имя файла, в который будет сохранено содержимое статьи
        URL articleUrl = new URL(url);
        Scanner scanner = new Scanner(articleUrl.openStream());
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            writer.write(line);
            writer.newLine();
        }
        scanner.close();
        writer.close();
        System.out.println("Статья была успешно сохранена в файл " + fileName);

    }

    private static void extracted16() {
        int a = 4;
        int b = 7;
        int c = 9;

        if (a > b && a > c) {
            System.out.println("Наибольше число: " + a);
        } else if (b > a && b > c) {
            System.out.println("Наибольше число: " + b);
        }else {
            System.out.println("Наибольше число: " + c);
        }
    }

    private static void extracted15() {
        String str2 = "Привет,  дела?";
        String str1 = "Привет";
        if (str1.length() > str2.length()){
            System.out.println(str1 + " Длинее чем " + str2);
        }else {
            System.out.println(str2 + " Длинее чем " + str1);

        }

    }

    private static void extracted14() {
            String str = "Привет, меня зовут Дмитрий. И я учусь на программиста ";
            System.out.println(str);
            String strReplace = str.replace("о", "обро").replace("а","0.15");
            System.out.println(strReplace);
    }



    private static void extracted13() {
        String str = "Привет, меня зовут Дмитрий. И я учусь на программиста ";
        System.out.println(str.toUpperCase());
    }

    private static void extracted12() {
        String str = "Привет, меня зовут Дмитрий. И я учусь на программиста ";
        System.out.println(str);
        String strReplace = str.replace("о", "обро");
        System.out.println(strReplace);
    }

    private static void extracted11() {
        for (int i = 0; i > -10012; i--) {
            System.out.print(i);
        }
        System.out.println(" ");
    }

    private static void extracted10() {
        for (int i = 100; i < 112; i++) {
            System.out.print(i);
        }
        System.out.println(" ");
    }

    private static void extracted9() {
        for (int i = 50; i < 10011; i++) {
            System.out.print(i);
        }
        System.out.println(" ");
    }

    private static void extracted8() {
        for (int i = 1; i < 101; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    private static void extracted7() {

    }

    private static void extracted6() {

    }

    private static void extracted5() {


    }

    private static void extracted4() {
        double numbers = Math.pow(2, 10);
        if (numbers > 512) {
            System.out.println("Pentium 2");
        } else {
            System.out.println("ARM");
        }
    }

    private static void extracted3() {
        double numbers = Math.sqrt(15_000_000_000d);
        if (numbers < 5000) {
            System.out.println("два измерения лучше, чем одно");
            System.out.println(numbers);
        } else {
            System.out.println("numbers " + "> " + 5000);
        }
    }

    private static void extracted2() {
        int a = 2;
        if (a > 0) {
            System.out.println("позитив");
        } else {
            System.out.println("отрицательно");
        }

    }


    private static void extracted1() {
        double numbers = Math.pow(5, 15);
        if (numbers > 1_000_000_000) {
            System.out.println(" Power is a power");
        } else {
            System.out.println("Меньше");
        }
    }
}
