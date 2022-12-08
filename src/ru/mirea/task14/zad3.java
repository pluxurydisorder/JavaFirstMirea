package ru.mirea.task14;

import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class zad3
{
    public static void main(String[] args)
    {
        taskThree();
    }
    private static void taskThree()
    {
        Pattern pattern = Pattern.compile("(?:\\s|^)(\\d+(\\.\\d{1,2})?) \\b(?:USD|RUB|EU)\\b");
        Matcher matcher = pattern.matcher("2 USD, 5.12 RUB, 10 ER, 12 EU");
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
