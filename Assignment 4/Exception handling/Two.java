import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Two {

    public static void main(String[] args) {
        try {
            // Call the readFile method with the file name
            readFile("test.txt");
        } catch (FileNotFoundException e) {
            // Handle the exception if the file is not found
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        // Create a File object with the given file name
        File file = new File(fileName);
        // Create a Scanner object to read the file
        Scanner scanner = new Scanner(file);
        // Read and print the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        // Close the scanner
        scanner.close();
    }
}