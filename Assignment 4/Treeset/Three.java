import java.util.*;
public class Three
{
	public static void main(String[] args) {
		TreeSet<String> tree_set1 = new TreeSet<String>();
        tree_set1.add("Red");//adding values to original tree
        tree_set1.add("Green");
        tree_set1.add("Orange");
        System.out.println("Tree set1: " + tree_set1);
        TreeSet<String> tree_set2=new TreeSet<String>();
        tree_set2.addAll(tree_set1);//copying values from one tree to the other tree
        System.out.println("Tree set2: "+ tree_set2);
	}
}