import java.util.*;
public class Five
{
	public static void main(String[] args) {
	    TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        treeMap.put("C", 3);
        treeMap.put("D", 4);
        // get a set view of the keys in the tree map
        Set<String> keys = treeMap.keySet();
        // print the keys using a for-each loop
        System.out.println("Keys in the tree map:");
        for (String key : keys) {
            System.out.println(key);
        }
	}
}