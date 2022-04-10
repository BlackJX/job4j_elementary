package ru.job4j.calculator;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double residualAndSegmentation(double first, double second) {
        return MathFunction.residual(first, second)
                + MathFunction.segmentation(first, second);
    }

    public static double sumAndResidualAndMultiplyAndSegmentation(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second)
                    + MathFunction.residual(first, second)
                        + MathFunction.segmentation(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + residualAndSegmentation(10, 20));
        System.out.println("Результат расчета равен: " + sumAndResidualAndMultiplyAndSegmentation(10, 20));
    }
}
