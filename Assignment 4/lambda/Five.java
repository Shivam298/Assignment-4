import java.util.Arrays;
import java.util.List;

public class Five {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        // Print the original list of strings
        System.out.println("Original list:");
        for (String name : names) {
            System.out.print(name + " ");
        }
        // Sort the list of strings in alphabetical order using lambda expression
        names.sort((s1, s2) -> s1.compareTo(s2));
        // Print the sorted list of strings
        System.out.println("\nSorted list:");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}