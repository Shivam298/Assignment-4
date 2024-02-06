import java.util.LinkedList;
import java.util.ListIterator;

public class Six {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // get the elements to insert from the user
        String first = "Fig"; // change this as needed
        String last = "Grape"; // change this as needed

        // insert the elements at the first and last positions
        list.addFirst(first);
        list.addLast(last);

        // display the updated list
        System.out.println("The list after insertion:");
        System.out.println(list);
}
}