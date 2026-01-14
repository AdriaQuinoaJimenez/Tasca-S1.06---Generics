package nivell2.exercici1.app;

import nivell2.exercici1.model.GenericMethods;
import nivell2.exercici1.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Juan", "Rodriguez", 23);
        Person person2 = new Person("Mario", "Ortiz", 81);
        Person person3 = new Person("Paco", "Martinez", 44);
        Person person4 = new Person("Isabel", "Jimenez", 32);

        String word = "Hola";
        Integer number = 500;

        GenericMethods.printElements(word, number, person, person2, person3, person4);
    }
}
