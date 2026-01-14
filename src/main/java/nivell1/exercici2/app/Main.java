package nivell1.exercici2.app;

import nivell1.exercici2.model.GenericMethods;
import nivell1.exercici2.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Juan", "Rodriguez", 23);
        String word = "Hola";
        Integer number = 500;

        GenericMethods.printElements(person,word, number);
    }
}
