package org.example.tema1.lesson9;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task2 {
    public static void main(String[] args) throws URISyntaxException, IOException {
//        String page = downloadWebPage("https://cdnstatic.rg.ru/uploads/photogallery/2022/12/25/15_6c5.jpg");
        String page = downloadWebPage("https://api.nasa.gov/planetary/apod?api_key=RYbTxph2QfAx0nr82YBkc0FKEjZzNq4exDqZ3naY&date=2000-01-01");
//        System.out.println(page);
        int urlBegin = page.lastIndexOf("url");
        int urlEnd = page.lastIndexOf("}");
        String url = page.substring( urlBegin+ 6, urlEnd - 1);
        System.out.println(url);

        try(InputStream in = new URL(url).openStream()){
            Files.copy(in, Paths.get("image.jpg"));
        }

//        String image = downloadWebPage(page);
////        System.out.println(image);
//        PrintWriter writer = new PrintWriter("picture.jpg");
//        writer.print(image);
//        writer.close();


    }

    private static String downloadWebPage(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }

}


