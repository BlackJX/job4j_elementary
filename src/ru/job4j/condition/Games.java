package src.ru.job4j.condition;

public class Games {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to he computer club.");
        } else {
            System.out.println("I cant.");
        }
    }

    public static void main(String[] args) {
        Games.permission(true, true);
        Games.permission(true, false);
        Games.permission(false, false);
        Games.permission(false, false);
            }
}
