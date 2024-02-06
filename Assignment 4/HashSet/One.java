import java.util.LinkedList;
import java.util.ListIterator;
import java.util.HashSet;
public class One {

    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");

        // print the original hash set
        System.out.println("The original hash set: " + h_set);

        // get the element to append from the user
        String element = "Blue"; // change this as needed

        // append the element to the end of the hash set
        h_set.add(element);

        // print the updated hash set
        System.out.println("The hash set after appending: " + h_set);
    }
}