import java.io.*;
import java.util.*;

class Two
{ 
public static void main(String args[]) 
	{ 
        LinkedList<String> names = new LinkedList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        for (String name : names) {
          System.out.println(name);
        }
	} 
} 