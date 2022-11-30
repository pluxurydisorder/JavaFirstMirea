package ru.mirea.task22;


public double Calculator()
        {
        Stack<double> locals = new();
        int counter = 0;
        for (int i = 0; i < postfixExpr.Length; i++)
        {
        char c = postfixExpr[i];
        if (Char.IsDigit(c))
        {
        //	Парсим
        string number = GetStringNumber(postfixExpr, ref i);
        locals.Push(Convert.ToDouble(number));
        }
        else if (operationPriority.ContainsKey(c))
        {
        counter += 1;
        if (c == '~')
        {
        double last = locals.Count > 0 ? locals.Pop() : 0;
        locals.Push(Execute('-', 0, last));
        Console.WriteLine($"{counter}) {c}{last} = {locals.Peek()}");
        continue;
        }

        double second = locals.Count > 0 ? locals.Pop() : 0,
        first = locals.Count > 0 ? locals.Pop() : 0;
        locals.Push(Execute(c, first, second));
        Console.WriteLine($"{counter}) {first} {c} {second} = {locals.Peek()}");
        }
        }
        return locals.Pop();
        }
