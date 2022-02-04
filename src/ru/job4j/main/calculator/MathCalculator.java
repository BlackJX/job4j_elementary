package src.ru.job4j.main.calculator;

import static src.ru.job4j.main.calculator.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double residualAndSegmentation(double first, double second) {
        return residual(first, second)
                + segmentation(first, second);
    }

    public static double sumAndResidualAndMultiplyAndSegmentation(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                    + residual(first, second)
                        + segmentation(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + residualAndSegmentation(10, 20));
        System.out.println("Результат расчета равен: " + sumAndResidualAndMultiplyAndSegmentation(10, 20));
    }
}
