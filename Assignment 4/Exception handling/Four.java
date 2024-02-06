import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Four {

    public static void main(String[] args) {
        try {
            // Call the readFile method with the file name
            readFile("test.txt");
        } catch (FileNotFoundException e) {
            // Handle the exception if the file is not found
            System.out.println("Error: " + e.getMessage());
        } catch (EmptyFileException e) {
            // Handle the exception if the file is empty
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException, EmptyFileException {
        // Create a File object with the given file name
        File file = new File(fileName);
        // Create a Scanner object to read the file
        Scanner scanner = new Scanner(file);
        // Check if the file is empty
        if (!scanner.hasNextLine()) {
            // Close the scanner
            scanner.close();
            // Throw a custom exception if the file is empty
            throw new EmptyFileException("File is empty.");
        }
        // Read and print the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        // Close the scanner
        scanner.close();
    }
}

// Define a custom exception class for empty files
class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}