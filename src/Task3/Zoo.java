package Task3;
/**
 * Using IntelliJ IDEA, create a project, package.
 * Using the Zoo class Task 2, delete 3, 5, 7 animals, find out the size of the list and output it to the console.
 */

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        // In the main method of the Zoo class, create a list of animals using the ArrayList class.
        List<String> animals = new ArrayList<>();
        //Add 8 animals to the list using the add(index, element) method.
        animals.add(0, "Tiger");
        animals.add(1, "Lion");
        animals.add(2, "Elephant");
        animals.add(3, "Giraffe");
        animals.add(4, "Monkey");
        animals.add(5, "Zebra");
        animals.add(6, "Kangaroo");
        animals.add(7, "Bear");
        // delete from end, to avoid mistakes
        animals.remove(6); // remove seventh animal (Kangaroo)
        animals.remove(4); // remove fifth animal (Monkey)
        animals.remove(2); // remove third animal (Elephant)

        System.out.println("Size of list: " + animals.size()); // find and show the size of a new list
        System.out.println("New list of animals in Zoo: ");
        System.out.println(animals);
    }
}
