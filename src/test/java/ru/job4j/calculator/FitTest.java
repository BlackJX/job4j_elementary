package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.calculator.Fit;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomen155Then51dot74() {
        short in = 155;
        double expected = 51.74;
        double out = Fit.womenWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}