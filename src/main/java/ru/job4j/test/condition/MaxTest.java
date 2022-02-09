package src.main.java.ru.job4j.test.condition;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.ru.job4j.main.condition.Max;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }
}