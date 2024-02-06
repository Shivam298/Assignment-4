import java.io.*;
import java.util.*;

class Five
{ 
public static void main(String args[]) 
	{ 
		ArrayList<String> colours=new ArrayList<String>();
		colours.add("Red");
		colours.add("Yellow");
		System.out.println(colours);
		colours.remove(1);
		colours.add(1,"Black");
		System.out.println(colours);
	} 
} 