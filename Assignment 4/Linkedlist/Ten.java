import java.util.LinkedList;
import java.util.ListIterator;

public class Ten {

    public static void main(String[] args) {
       LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana");
        list.add("Elderberry");

        // get the element to search from the user
        String element = "Banana"; // change this as needed

        // get the first occurrence of the element
        int firstIndex = list.indexOf(element);

        // get the last occurrence of the element
        int lastIndex = list.lastIndexOf(element);

        // display the results
        if (firstIndex == -1) {
            System.out.println("Element not found in the list.");
        } else {
            System.out.println("First occurrence of " + element + " is at index " + firstIndex);
            System.out.println("Last occurrence of " + element + " is at index " + lastIndex);
        }
    }
}