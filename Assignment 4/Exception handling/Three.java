import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Three {

    public static void main(String[] args) {
        try {
            // Call the readFile method with the file name
            readFile("test.txt");
        } catch (FileNotFoundException e) {
            // Handle the exception if the file is not found
            System.out.println("Error: " + e.getMessage());
        } catch (PositiveNumberException e) {
            // Handle the exception if a positive number is found
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException, PositiveNumberException {
        // Create a File object with the given file name
        File file = new File(fileName);
        // Create a Scanner object to read the file
        Scanner scanner = new Scanner(file);
        // Read and check the numbers from the file
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num > 0) {
                // Throw a custom exception if the number is positive
                throw new PositiveNumberException("Positive number found: " + num);
            }
            System.out.println(num);
        }
        // Close the scanner
        scanner.close();
    }
}

// Define a custom exception class for positive numbers
class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}