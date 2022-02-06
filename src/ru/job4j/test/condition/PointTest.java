package src.ru.job4j.test.condition;

import org.junit.Assert;
import org.junit.Test;
import src.ru.job4j.main.condition.Point;

import static org.junit.Assert.*;
import static org.junit.Test.*;
import static src.ru.job4j.main.condition.Point.*;

public class PointTest {
    @Test
    public void when00to20then2 () {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to2020then26dot87 () {
        double expected = 26.87;
        int x1 = 1;
        int y1 = 1;
        int x2 = 20;
        int y2 = 20;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when77to1414then9dot89 () {
        double expected = 9.89;
        int x1 = 7;
        int y1 = 7;
        int x2 = 14;
        int y2 = 14;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to99then8dot48 () {
        double expected = 8.48;
        int x1 = 3;
        int y1 = 3;
        int x2 = 9;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}