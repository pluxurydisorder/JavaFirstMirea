package ru.mirea.task22;

private string GetStringNumber(string expr, ref int pos)
        {
            string strNumber = "";
            for (; pos < expr.Length; pos++)
        {
        char num = expr[pos];
        if (Char.IsDigit(num))
        strNumber += num;
        else
        {
        pos--;
        break;
        }
        }
        return strNumber;
        }
