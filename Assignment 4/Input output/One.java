import java.io.File;

public class One {

    public static void main(String[] args) {
        // Create a File object for the current directory
        File folder = new File(".");
        // Get an array of File objects for the files and directories in the folder
        File[] listOfFiles = folder.listFiles();
        // Loop through the array and print the names
        for (File file : listOfFiles) {
            System.out.println(file.getName());
        }
    }
}