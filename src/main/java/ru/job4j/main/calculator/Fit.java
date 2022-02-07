package src.main.java.ru.job4j.main.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womenWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
    }

    static {
        short height = 155;
        double women = Fit.womenWeight(height);
        System.out.println("Women 155 is " + women);
    }
}