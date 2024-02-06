import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class Three {
  public static void main(String[] args) {
    // Create a File object with the pathname
    File file = new File("Three.java");
    // Convert the File object to a Path object
    Path path = file.toPath();
    // Check if the file or directory exists using Files.exists()
    boolean exists = Files.exists(path);
    // Print the result
    System.out.println("The file or directory " + path + " exists: " + exists);
  }
}