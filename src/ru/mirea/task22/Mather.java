package ru.mirea.task22;



public class Mather
{
    public string infixExpr {get; private set; }
    public string postfixExpr { get; private set; }
    private Dictionary<char, int> operationPriority = new() {
    {'(', 0},
    {'+', 1},
    {'-', 1},
    {'*', 2},
    {'/', 2},
    {'^', 3},
    {'~', 4}	//	Унарный минус
};
    public Mather(string expression)
    {
        infixExpr = expression;
        postfixExpr = ToPostfix(infixExpr + "\r");
    }
}