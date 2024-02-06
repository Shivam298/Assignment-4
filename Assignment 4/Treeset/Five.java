import java.util.*;
public class Five
{
	public static void main(String[] args) {
		TreeSet<Integer> tree_set = new TreeSet<Integer>();
        tree_set.add(10);//adding values in treeset
        tree_set.add(500);
        tree_set.add(200);
        tree_set.add(130);
        System.out.println("Tree set: " + tree_set);//displaying tree set
        System.out.println("First element "+tree_set.first());//first value in tree
        System.out.println("Last element "+tree_set.last());//last value in tree
	}
}