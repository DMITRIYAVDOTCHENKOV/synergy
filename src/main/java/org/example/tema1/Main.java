package org.example.tema1;

import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) throws IOException {
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
        }

