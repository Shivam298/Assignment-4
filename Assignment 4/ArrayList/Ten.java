import java.io.*;
import java.util.*;

class Ten
{ 
public static void main(String args[]) 
	{ 
        // Create an array list of strings
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        
        // Print the array list before shuffling
        System.out.println("Before shuffling: " + names);
        
        // Shuffle the array list using Collections.shuffle
        Collections.shuffle(names);
        
        // Print the array list after shuffling
        System.out.println("After shuffling: " + names);

                                  
	} 
}