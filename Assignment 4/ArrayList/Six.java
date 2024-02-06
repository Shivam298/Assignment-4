import java.io.*;
import java.util.*;

class Six
{ 
public static void main(String args[]) 
	{ 
		ArrayList<String> colours=new ArrayList<String>();
		colours.add("Red");
		colours.add("Yellow");
		colours.add("Black");
		colours.add("Blue");
		System.out.println(colours);
		colours.remove(3);
		System.out.println(colours);
	} 
}