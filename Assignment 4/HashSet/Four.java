import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.*;
public class Four {

    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print the original hash set
        System.out.println("The original hash set: " + colors);

        // Clear the hash set
        colors.clear();

        // Print the hash set after clearing
        System.out.println("The hash set after clearing: " + colors);
    }
}