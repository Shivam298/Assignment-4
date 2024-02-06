import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.*;
public class Three {

    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Get the number of elements in the hash set
        int size = colors.size();

        // Print the result
        System.out.println("The hash set contains " + size + " elements.");
    }
}