import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.*;
public class Four {

    public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();
            // add some elements to the set
            set.add("Java");
            set.add("Python");
            set.add("C++");
            // print the original set
            System.out.println("Original set: " + set);
            // clear the set using the clear() method
            set.clear();
            // print the updated set
            System.out.println("Updated set: " + set);
    }
}