import java.util.Arrays;
import java.util.List;

public class Three {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> list = Arrays.asList("Hello", "World", "Java", "Lambda");

        // Print the original strings
        System.out.println("\nOriginal strings:");
        for (String str : list) {
            System.out.println(str);
        }

        // Convert strings to lowercase using lambda expression
        list.replaceAll(str -> str.toLowerCase());

        // Print the list of lowercase strings
        System.out.println("\nLowercase strings:");
        for (String str : list) {
            System.out.println(str);
        }

        // Convert strings to uppercase using lambda expression
        list.replaceAll(str -> str.toUpperCase());

        // Print the list of uppercase strings
        System.out.println("\nUppercase strings:");
        for (String str : list) {
            System.out.println(str);
        }
    }
}