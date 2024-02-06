import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.*;
public class Five {

    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Test if the hash set is empty or not
        boolean result = colors.isEmpty();

        // Print the result
        System.out.println("Is the hash set empty? " + result);
    }
}