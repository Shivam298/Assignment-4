import java.io.File;

public class Four {
  public static void main(String[] args) {
    // Create a File object with the pathname
    File file = new File("Four.java");
    // Check if the file or directory exists
    boolean exists = file.exists();
    if (exists) {
      // Check if the file or directory is readable
      boolean readable = file.canRead();
      // Check if the file or directory is writable
      boolean writable = file.canWrite();
      // Print the results
      System.out.println("The file or directory " + file + " exists: " + exists);
      System.out.println("The file or directory " + file + " is readable: " + readable);
      System.out.println("The file or directory " + file + " is writable: " + writable);
    } else {
      System.out.println("The file or directory " + file + " does not exist.");
    }
  }
}