import java.util.LinkedList;
import java.util.ListIterator;

public class Seven {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // get the element to insert from the user
        String element = "Fig"; // change this as needed

        // insert the element at the front of the list
        list.addFirst(element);

        // display the updated list
        System.out.println("The list after insertion:");
        System.out.println(list);
    }
}