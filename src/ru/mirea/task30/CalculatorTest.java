package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    @Test
    public void getSum() {
        int expected = 29;
        Calculator1 calc = new Calculator1();
        int actual = calc.getSum(14, 15);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDif() {
        int expected = 25;
        Calculator1 calc = new Calculator1();
        int actual = calc.getDif(50, 25);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMult() {
        int expected = 100;
        Calculator1 calc = new Calculator1();
        int actual = calc.getMult(10, 10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDiv() {
        double expected = 4;
        Calculator1 calc = new Calculator1();
        double actual = calc.getDiv(20, 5);
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void getSquare() {
        int expected = 25;
        Calculator1 calc = new Calculator1();
        int actual = calc.getSquare(5);
        Assert.assertEquals(expected, actual);
    }
}
