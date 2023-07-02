package Task2;
/**
 * Using Intelij IDEA, create a project, package.
 * Create a Zoo class. In the class, create a list to record 8 animals using the add(index, element) method.
 * Output the list to the console.
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

        System.out.println("List of animals in Task2.Zoo: ");
        System.out.println(animals);
    }
}
