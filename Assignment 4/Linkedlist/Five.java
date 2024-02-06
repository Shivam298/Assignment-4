import java.util.LinkedList;
import java.util.ListIterator;

public class Five {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // get the element and the position from the user
        String element = "Fig"; // change this as needed
        int position = 3; // change this as needed

        // check if the position is valid
        if (position < 1 || position > list.size() + 1) {
            System.out.println("Invalid position.");
        } 
        else {
            // get a list iterator from the beginning of the list
            ListIterator<String> iterator = list.listIterator();

            // move the iterator to the specified position
            for (int i = 0; i < position - 1; i++) {
                iterator.next();
            }

            // insert the element at the iterator's position
            iterator.add(element);

            // display the updated list
            System.out.println("The list after insertion:");
            System.out.println(list);
}
}
}