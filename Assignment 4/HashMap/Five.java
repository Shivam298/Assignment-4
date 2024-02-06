import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.*;
public class Five {

    public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();
            // add some elements to the set
            set.add("Java");
            set.add("Python");
            set.add("C++");
            // print the original set
            System.out.println("Original set: " + set);
            // test if the set is empty using the isEmpty() method
            boolean result = set.isEmpty();
            // print the result
            System.out.println("Is the set empty? " + result);
    }
}