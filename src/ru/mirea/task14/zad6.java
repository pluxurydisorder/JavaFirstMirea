package ru.mirea.task14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad6
{
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        Matcher matcher = pattern.matcher("user@example.com");
        Matcher matcher1 = pattern.matcher("myhost@@@com.ru");
        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());
    }
}
