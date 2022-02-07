package src.main.java.ru.job4j.main.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float in1 = 140;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        float dollar = Converter.rubleToDollar(140);
        float expected2 = 2.3f;
        float out2 = Converter.rubleToEuro(in1);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are " + euro + " euro." + passed1);
        System.out.println("140 rubles are " + dollar + " dollar." + passed2);
    }
}