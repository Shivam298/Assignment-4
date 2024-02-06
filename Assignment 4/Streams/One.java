import java.util.*;
public class One
{
	public static void main(String[] args) {
	    List<Integer> numbers = Arrays.asList(10, 20, 30);
        // calculate the average using streams
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        // print the result
        System.out.println("The average of the list is: " + average);
	}
}