package org.example.tema1.lesson8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class Task {
    public static void main(String[] args) throws URISyntaxException, IOException {
        String page = downloadWebPage("https://breakingbadapi.com/api/quote/random");
        System.out.println(page);
        int quoteStart = page.lastIndexOf("quote");
        int quoteEnd = page.indexOf("autor");
        String quote = (page.substring(quoteStart + 8, quoteEnd - 3));
        System.out.println(quote.length() > 50 ? quote.substring(0, 50) + "..." : quote);

//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int z = scanner.nextInt();
//
//        int max = (x > y && x > z) ? x : (y > z && y > x) ? y : z;
//        System.out.println(max);
    }

    public static String downloadWebPage(String url) throws URISyntaxException, IOException {
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
