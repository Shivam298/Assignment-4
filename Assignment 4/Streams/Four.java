import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Four
{
	public static void main(String[] args) {
	    List<String> list = Arrays.asList("a", "b", "c", "d", "e", "a", "b");
        // remove duplicates using streams
        List<String> distinctList = list.stream()
                .distinct()
                .collect(Collectors.toList());
        // print the result
        System.out.println("List without duplicates: " + distinctList);
	}
}