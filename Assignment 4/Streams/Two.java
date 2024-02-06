import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Two
{
	public static void main(String[] args) {
	    List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        // convert the list to uppercase using streams
        List<String> uppercaseList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        // print the uppercase list
        System.out.println("Uppercase list: " + uppercaseList);
        // convert the list to lowercase using streams
        List<String> lowercaseList = list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        // print the lowercase list
        System.out.println("Lowercase list: " + lowercaseList);
	}
}