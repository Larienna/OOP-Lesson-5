package Task5;
/**
 *Using IntelliJ IDEA, create a Friends class. Use the ArrayList methods to add an array of friends' names.
 * Display the list of friends, then display the list of friends, sorted in alphabetical order.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Anna");
        name.add("Dima");
        name.add("Andrey");
        name.add("Marina");
        System.out.println("Friends list: " + name);
        // Sorting
        Collections.sort(name);
        System.out.println("Sorted list of friends: " + name);
    }
}