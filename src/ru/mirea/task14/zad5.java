package ru.mirea.task14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad5
{
    public static void main(String[] args)
    {
        taskFive();
    }
    private static void taskFive()
    {
        Pattern pattern = Pattern.compile("[0-9]+[0-9]+\\/+[0-9]+[0-9]+\\/+[0-9]+[0-9]+[0-9]+[0-9]");
        Matcher matcher = pattern.matcher("29/02/2000");
        Matcher matcher1 = pattern.matcher("30-04-2003");
        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());

    }
}

