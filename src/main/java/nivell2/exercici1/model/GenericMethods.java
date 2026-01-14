package nivell2.exercici1.model;

public class GenericMethods {

    public static <S, V> void printElements(String string, S s, V... v) {
        System.out.println("1st Element: " + string + " | 2nd Element: " + s);
        System.out.println("3rd Elements: ");
        for (V v2 : v) {
            System.out.print(v2 + " | ");
        }
    }
}
