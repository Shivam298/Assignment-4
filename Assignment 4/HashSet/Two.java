import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.*;
public class Two {

    public static void main(String[] args) {
       HashSet<String> list = new HashSet<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // get an iterator from the hash list
        Iterator<String> iterator = list.iterator();

        // iterate through the elements using the iterator
        System.out.println("Elements using iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // iterate through the elements using a for-each loop
        System.out.println("Elements using for-each loop:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}