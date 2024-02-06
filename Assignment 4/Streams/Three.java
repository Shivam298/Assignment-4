import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Three
{
	public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // partition the list into even and odd numbers and sum them using streams
        Map<Boolean, Integer> result = list.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.summingInt(Integer::intValue)));

        // print the result
        System.out.println("Sum of even numbers: " + result.get(true));
        System.out.println("Sum of odd numbers: " + result.get(false));
	}
}