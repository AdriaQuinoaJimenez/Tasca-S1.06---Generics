package nivell2.exercici1.app;

import nivell2.exercici1.model.GenericMethods;
import nivell2.exercici1.model.Person;

public class Main {
    public static void main(String[] args) {

         /*EXERCICI 1 Y EXERCICI 2 LEVEL 2*/
        Person person = new Person("Juan", "Rodriguez", 23);
        Person person2 = new Person("Mario", "Ortiz", 81);
        Person person3 = new Person("Paco", "Martinez", 44);
        Person person4 = new Person("Isabel", "Jimenez", 32);

        String word = "Hola";
        Integer number = 500;
        Integer number2 = 333;
        Integer number3 = 999;

        GenericMethods.printElements(word, number, person, person2, person3, person4);
        System.out.println("\n");
        GenericMethods.printElements(word, person3, number, number2, number3);
        System.out.println("\n");
        GenericMethods.printElements(word, person4, number);
        System.out.println("\n");
        GenericMethods.printElements(word, person4);
    }
}
