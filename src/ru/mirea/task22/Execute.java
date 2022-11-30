package ru.mirea.task22;

private double Execute(char op, double first, double second) => op switch {
        '+' => first + second,					//	Сложение
        '-' => first - second,					//	Вычитание
        '*' => first * second,					//	Умножение
        '/' => first / second,					//	Деление
        '^' => Math.Pow(first, second),	//	Степень
        _ => 0	//	Возвращает, если не был найден подходящий оператор
        };