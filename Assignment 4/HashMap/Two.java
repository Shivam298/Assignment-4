import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.*;
public class Two {

    public static void main(String[] args) {
            LinkedList<String> hashList = new LinkedList<>();
            // add some elements to the hash list
            hashList.add("Java");
            hashList.add("Python");
            hashList.add("C++");
            hashList.add("Ruby");
            // iterate through the hash list using a for-each loop
            System.out.println("Using a for-each loop:");
            for (String element : hashList) {
              System.out.println(element);
            }
    }
}