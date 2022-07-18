package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void  whenConvert140RblThen2dot3333Dollar() {
        float in = 140;
        float expected = 2.3333f;
        float out = Converter.rubleToDollar(in);
        assertThat(out).isCloseTo(expected, offset(0.0001F));
    }
}
