package src.main.java.ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    public static void main(String[] args) {
        System.out.println(exist(2.0, 2.0, 2.0));
        if (exist(2.0, 2.0, 2.0)) {
        System.exit(0);
    } else {
        System.exit(1);
        }
    }
}