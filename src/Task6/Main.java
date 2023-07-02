package Task6;
/**
 * Using IntelliJ IDEA, create a project, package.
 * Create a class Main, create a list in it, add teachers you can remember from school.
 * And getting the index of the best teacher and himself is not so much. Output the list to the console.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teacher = new ArrayList<>();
        // Add teachers to the list
        String[] names = {"Herr Müller", "Frau Schneider", "Herr Schmidt", "Frau Schulz", "Frau Meyer", "Herr Fischer"};
        teacher.addAll(Arrays.asList(names));

        System.out.println("List of teachers: " + teacher);

        System.out.println("Index of the best teacher: " + Arrays.asList(names).indexOf("Frau Schulz"));
        System.out.println("The best Teacher: " + teacher.get(3)); // get index

        System.out.println("Index of the worst teacher ever: " + Arrays.asList(names).indexOf("Herr Fischer"));
        System.out.println("The worst Teacher: " + teacher.get(5));
    }
}
