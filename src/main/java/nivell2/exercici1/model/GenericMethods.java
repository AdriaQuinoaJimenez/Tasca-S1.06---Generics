package nivell2.exercici1.model;

public class GenericMethods {

    public static <S, V> void printElements(String firstElement, S secondElement, V... varArgs) {
        System.out.println("1st Element: " + firstElement + " | 2nd Element: " + secondElement);
        System.out.println("3rd Elements: ");
        for (V v2 : varArgs) {
            System.out.print(v2 + " | ");
        }
    }
}
