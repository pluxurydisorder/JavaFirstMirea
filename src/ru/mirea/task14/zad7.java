package ru.mirea.task14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad7
{
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])");
        Matcher matcher = pattern.matcher("TrySpy1");
        Matcher matcher1 = pattern.matcher("smart_pass");
        System.out.println(matcher.find());
        System.out.println(matcher1.matches());
    }
}
