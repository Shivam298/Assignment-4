import java.util.*;

public class Five {

    public static void main(String[] args) {
        try {
            // Call the readNumbersFromUser method to get a list of integers
            List<Integer> numbers = readNumbersFromUser();
            // Call the checkDuplicates method to check for duplicates
            checkDuplicates(numbers);
            System.out.println("No duplicate numbers!");
        } catch (DuplicateNumberException e) {
            // Handle the exception if a duplicate number is found
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static List<Integer> readNumbersFromUser() {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to input? ");
        int count = scanner.nextInt();

        System.out.println("Input the integers:");
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        scanner.close();
        return numbers;
    }

    public static void checkDuplicates(List<Integer> numbers) throws DuplicateNumberException {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int num : numbers) {
            if (uniqueNumbers.contains(num)) {
                // Throw a custom exception if the number is a duplicate
                throw new DuplicateNumberException("Duplicate number found: " + num);
            }
            uniqueNumbers.add(num);
        }
    }
}

// Define a custom exception class for duplicate numbers
class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}