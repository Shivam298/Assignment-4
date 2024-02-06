import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Four {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // Print the original numbers
        System.out.println("Original numbers:");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        // Filter out even numbers using lambda expression
        List<Integer> evenNumbers = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        // Print the even numbers
        System.out.print("\nEven numbers:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        // Filter out odd numbers using lambda expression
        List<Integer> oddNumbers = nums.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
        // Print the odd numbers
        System.out.print("\nOdd numbers:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
    }
}