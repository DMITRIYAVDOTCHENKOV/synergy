package org.example.tema1.theFinalWorkOfTheFirstTopic;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {
    static double minCurrencyValue = Double.MAX_VALUE;
    static double maxCurrencyValue = Double.MIN_VALUE;
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt() - 1;
        scanner.close();

        String url = "http://www.cbr.ru/scripts/XML_dynamic.asp?date_req1=01/"
                + String.format("%02d", month + 1) + "/" + year + "&date_req2="
                + getLastDayOfMonth(year, month) + "/" + String.format("%02d", month + 1) + "/" + year
                + "&VAL_NM_RQ=R01235";

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new URL(url).openStream());
        NodeList nodeList = document.getElementsByTagName("Record");
        Map<Date, Double> currencyValues = new HashMap<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                Date date = dateFormat.parse(element.getAttribute("Date"));
                Double value = Double.parseDouble(element.getElementsByTagName("Value").item(0).getTextContent()
                        .replace(',', '.'));
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                if (calendar.get(Calendar.MONTH) == month && calendar.get(Calendar.YEAR) == year) {
                    currencyValues.put(date, value);
                    if (value < minCurrencyValue) {
                        minCurrencyValue = value;
                    }
                    if (value > maxCurrencyValue) {
                        maxCurrencyValue = value;
                    }
                }
            }
        }
        List<Date> sortedDates = new ArrayList<>(currencyValues.keySet());
        Collections.sort(sortedDates);
        for (Date date : sortedDates) {
            System.out.println(dateFormat.format(date) + ": " + currencyValues.get(date));
        }
        System.out.println("Минимальное значение за месяц: " + minCurrencyValue);
        System.out.println("Максимальное значение за месяц: " + maxCurrencyValue);
    }

    private static String getLastDayOfMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);
        int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return String.valueOf(day);
    }

}