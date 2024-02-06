import java.io.*;
import java.util.*;

class One
{ 
public static void main(String args[]) 
	{ 
        // Create a linked list of strings
        LinkedList<String> names = new LinkedList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // Print the linked list before appending
        System.out.println("Before appending: " + names);
        
        // Append the element "David" to the end of the list
        names.addLast("David");
        
        // Print the linked list after appending
        System.out.println("After appending: " + names);


                                  
	} 
} 