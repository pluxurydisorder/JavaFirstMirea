package ru.mirea.task22;

public class Program execute MatherExecuter
{
    static public void Main()
    {
        string expression = "15/(7-(1+1))*3-(2+(1+1))*15/(7-(200+1))*3-(2+(1+1))*(15/(7-(1+1))*3-(2+(1+1))+15/(7-(1+1))*3-(2+(1+1)))";
        Mather mather = new(expression);

        Console.WriteLine("Ввод: " + mather.infixExpr);
        Console.WriteLine("Постфиксная форма: " + mather.postfixExpr);
        Console.WriteLine("Итого: " + mather.Calc());
    }
}