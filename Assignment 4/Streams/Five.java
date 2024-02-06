import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Five
{
	public static void main(String[] args) {
	    List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        // specify the letter to check
        char letter = 'a';
        // count the number of strings that start with the letter using streams
        long count = list.stream()
                .filter(s -> s.charAt(0) == letter)
                .count();
        // print the result
        System.out.println("Number of strings that start with '" + letter + "': " + count);
	}
}