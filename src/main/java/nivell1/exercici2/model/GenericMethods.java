package nivell1.exercici2.model;

public class GenericMethods {

    public static <T, S, V> void printElements(T t, S s, V v) {
        System.out.println("1st Element: " + t + " | 2nd Element: " + s + " | 3rd Element: " + v);
    }
}
