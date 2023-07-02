package Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Using IntelliJ IDEA, create a project, package.
 * Create the Task5.Main class, create a list of integers and use the ListIterator to go through the list and increase the value by 1.
 */
public class Main {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(3);
        // Iterate through the list using a ListIterator and increment each element by 1
        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            iterator.set(number + 1);
        }
        // Print out the modified list
        System.out.println("Modified list: ");
        System.out.println(numbers);
    }
}
