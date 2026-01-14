package nivell1.exercici1.app;

import nivell1.exercici1.model.NoGenericMethods;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods noGenericMethods1 = new NoGenericMethods("Good Morning" ,"Good Afternoon", "Good Night");
        NoGenericMethods noGenericMethods2 = new NoGenericMethods("Good Night", "Good Morning", "Good Afternoon");

        System.out.println("noGenericMethods1: " + (String) noGenericMethods1.getObj1()+ " | "+ noGenericMethods1.getObj2() + " | " + noGenericMethods1.getObj3());
        System.out.println("noGenericMethods2: " + (String) noGenericMethods2.getObj1()+ " | "+ noGenericMethods2.getObj2() + " | " + noGenericMethods2.getObj3());
    }
}