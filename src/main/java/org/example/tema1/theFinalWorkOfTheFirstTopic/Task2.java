package org.example.tema1.theFinalWorkOfTheFirstTopic;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static org.example.tema1.lesson8.Task.downloadWebPage;

public class Task2 {
    static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public static void main(String[] args) throws URISyntaxException, IOException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате dd-MM-yyyy:");
        String dateString = scanner.nextLine();

        try {
            Date date = dateFormat.parse(dateString);
            Date previousDate = getPreviousDate(date);
            Date nextDate = getNextDate(date);

            double currencyValue = getCurrencyValue(date);
            double previousCurrencyValue = getCurrencyValue(previousDate);
            double nextCurrencyValue = getCurrencyValue(nextDate);

            System.out.println("Курс валют на выбранную дату: " + currencyValue);
            System.out.println("Курс валют на предыдущую дату: " + previousCurrencyValue);
            System.out.println("Курс валют на следующую дату: " + nextCurrencyValue);

            double growth = (currencyValue - previousCurrencyValue) / previousCurrencyValue * 100;
            double decrease = (nextCurrencyValue - currencyValue) / currencyValue * 100;

            System.out.println("Рост курса: " + growth + "%");
            System.out.println("Падение курса: " + decrease + "%");

            double maxValue = Math.max(Math.max(currencyValue, previousCurrencyValue), nextCurrencyValue);
            double minValue = Math.min(Math.min(currencyValue, previousCurrencyValue), nextCurrencyValue);

            System.out.println("Максимальное значение курса: " + maxValue);
            System.out.println("Минимальное значение курса: " + minValue);

        } catch (ParseException e) {
            System.err.println("Некорректный формат даты");
        }

        RecordingAphotoFromTheNASAWebsiteByTheEnteredDate(dateString);
    }

    private static Date getPreviousDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -1);
        return calendar.getTime();
    }

    private static Date getNextDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        return calendar.getTime();
    }

    static double getCurrencyValue(Date date) {
        double currencyValue = 0.0;
        String url = "http://www.cbr.ru/scripts/XML_daily.asp?date_req=" + dateFormat.format(date);
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new URL(url).openStream());
            NodeList nl = doc.getElementsByTagName("Valute");
            for (int i = 0; i < nl.getLength(); i++) {
                Node node = nl.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String code = element.getElementsByTagName("CharCode").item(0).getTextContent();
                    double value = Double.parseDouble(element.getElementsByTagName("Value").item(0).getTextContent().replace(',', '.'));
                    if (code.equals("USD")) {
                        currencyValue = value;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return currencyValue;
    }

    private static void RecordingAphotoFromTheNASAWebsiteByTheEnteredDate(String dateString) throws URISyntaxException, IOException {
        DateFormat inputDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        DateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        String formattedDate = null;
        try {
            date = inputDateFormat.parse(dateString);
            formattedDate = outputDateFormat.format(date);
        } catch (
                ParseException e) {
            e.printStackTrace();
        }
        String page = downloadWebPage("https://api.nasa.gov/planetary/apod?api_key" +
                "=RYbTxph2QfAx0nr82YBkc0FKEjZzNq4exDqZ3naY&date=" + formattedDate);
        int urlBegin = page.lastIndexOf("url");
        int urlEnd = page.lastIndexOf("}");
        String url = page.substring(urlBegin + 6, urlEnd - 1);
        try (InputStream in = new URL(url).openStream()) {
            Files.copy(in, Paths.get("image2.jpg"), StandardCopyOption.REPLACE_EXISTING);
        }
        System.out.println("Фото сохранено");
    }

}

