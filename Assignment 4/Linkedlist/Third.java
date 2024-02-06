import java.util.LinkedList;
import java.util.ListIterator;

public class Third {

    public static void main(String[] args) {
        // create a linked list of strings
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // get a list iterator from the specified position
        int position = 2; // change this as needed
        ListIterator<String> iterator = list.listIterator(position);

        // iterate through the remaining elements
        System.out.println("Elements from position " + position + ":");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}