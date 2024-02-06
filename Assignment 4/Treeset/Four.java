import java.util.*;
public class Four
{
	public static void main(String[] args) {
		TreeSet<String> tree_set1 = new TreeSet<String>();
        tree_set1.add("Red");
        tree_set1.add("Green");
        tree_set1.add("Blue");
        tree_set1.add("Yellow");
        System.out.println("Tree set1: " + tree_set1);
        // create reverse order views of the tree sets
        Iterator<String> it1 = tree_set1.descendingIterator();
        // print the elements in reverse order
        System.out.println("\nElements in reverse order:");
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
	}
}