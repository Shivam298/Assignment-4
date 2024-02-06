import java.io.*;
import java.util.*;

class Nine
{ 
public static void main(String args[]) 
	{ 
        // Create an array list of integers
        // Create an array list of strings
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        
        // Print the array list before copying
        System.out.println("Before copying: " + names);
        
        // Create another array list of strings
        ArrayList<String> namesCopy = new ArrayList<String>();
        
        // Add some dummy elements to the second array list
        // The size of the second array list must be equal or greater than the first one
        namesCopy.add("X");
        namesCopy.add("Y");
        namesCopy.add("Z");
        namesCopy.add("W");
        
        // Copy the elements of the first array list into the second one
        Collections.copy(namesCopy, names);
        
        // Print the array list after copying
        System.out.println("After copying: " + namesCopy);
                                  
	} 
}