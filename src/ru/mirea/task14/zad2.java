package ru.mirea.task14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad2
{
    public static void main(String[] args)
    {
        taskTwo();
    }
    private static void taskTwo()
    {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher("abcdefghijklmnopqrstuv18340");
        Matcher matcher1 = pattern.matcher("notthis");
        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());
    }
}