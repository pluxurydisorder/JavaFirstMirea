package ru.mirea.task22;

private string ToPostfix(string infixExpr)
        {
        string postfixExpr = "";
        Stack<char> stack = new();
        for (int i = 0; i < infixExpr.Length; i++)
        {
        char c = infixExpr[i];
        if (Char.IsDigit(c))
        {
        postfixExpr += GetStringNumber(infixExpr, ref i) + " ";
        }
        else if (c == '(')
        {
        stack.Push(c);
        }
        else if (c == ')')
        {
        while (stack.Count > 0 && stack.Peek() != '(')
        postfixExpr += stack.Pop();
        stack.Pop();
        }
        else if (operationPriority.ContainsKey(c))
        {
        char op = c;
        if (op == '-' && (i == 0 || (i > 1 && operationPriority.ContainsKey( infixExpr[i-1] ))))
        op = '~';
        while (stack.Count > 0 && ( operationPriority[stack.Peek()] >= operationPriority[op]))
        postfixExpr += stack.Pop();
        stack.Push(op);
        }
        }
        foreach (char op in stack)
        postfixExpr += op;
        return postfixExpr;
        }
