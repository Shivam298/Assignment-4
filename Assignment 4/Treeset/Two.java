import java.util.*;
public class Two {

    public static void main(String[] args) {
            TreeSet<String> tree_set = new TreeSet<String>();
            tree_set.add("Red");
            tree_set.add("Green");
            tree_set.add("Orange");
            tree_set.add("White");
            tree_set.add("Black");
            for(String str:tree_set)//iterating elements in tree set
            System.out.println(str);
    }
}