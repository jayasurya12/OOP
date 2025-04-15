package Modules.Inheritance;

import java.util.Random;

public class NameGenerator {
    static String[] firstNames = {
            "Raj", "Anu", "Vikram", "Sara", "Kiran", "Priya", "Ravi", "Nina", "Arjun", "Meera"
    };

    static String[] lastNames = {
            "Kumar", "Sharma", "Reddy", "Verma", "Nair", "Das", "Patel", "Joshi", "Menon", "Chopra"
    };

    public static String getRandomName() {
        Random rand = new Random();
        String fist = firstNames[rand.nextInt(firstNames.length)];
//        return firstName()[(int) (Math.random() * firstName().length)] + " " + lastName()[(int) (Math.random() * lastName().length)];
        String last = lastNames[rand.nextInt(lastNames.length)];
        return fist + " " + last;
    }
}
