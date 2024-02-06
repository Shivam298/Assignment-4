import java.util.LinkedList;
import java.util.ListIterator;

public class Nine {

    public static void main(String[] args) {
       LinkedList<String> fru_list = new LinkedList<>();
        // use add() method to add values in the linked list
        fru_list.add("Apple");
        fru_list.add("Banana");
        fru_list.add("Cherry");
        fru_list.add("Date");
        fru_list.add("Elderberry");

        // print original list
        System.out.println("Original linked list: " + fru_list);

        // create a new collection and add some elements
        LinkedList<String> new_fru_list = new LinkedList<>();
        new_fru_list.add("Fig");
        new_fru_list.add("Grape");

        // get the position from the user
        int position = 3; // change this as needed

        // check if the position is valid
        if (position < 1 || position > fru_list.size() + 1) {
            System.out.println("Invalid position.");
        } else {
            // add the new collection at the specified position of the existing linked list
            fru_list.addAll(position - 1, new_fru_list);

            // print the updated list
            System.out.println("The list after insertion: " + fru_list);
    }
}
}