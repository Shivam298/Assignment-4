import java.util.LinkedList;
import java.util.ListIterator;

public class Fourth {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // get a list iterator from the end of the list
        ListIterator<String> iterator = list.listIterator(list.size());

        // iterate through the previous elements
        System.out.println("Elements in reverse order:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
    }
}
}