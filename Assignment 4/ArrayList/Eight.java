import java.io.*;
import java.util.*;

class Eight
{ 
public static void main(String args[]) 
	{ 
	     // Create an array list of integers
         ArrayList<Integer> numbers = new ArrayList<Integer>();
         numbers.add(10);
         numbers.add(5);
         numbers.add(15);
         numbers.add(20);

         // Print the array list before sorting
         System.out.println("Before sorting: " + numbers);

         // Sort the array list using Collections.sort
         Collections.sort(numbers);

         // Print the array list after sorting
         System.out.println("After sorting: " + numbers);
	} 
}