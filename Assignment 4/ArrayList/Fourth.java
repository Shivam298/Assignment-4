import java.io.*;
import java.util.*;

class Fourth
{ 
public static void main(String args[]) 
	{ 
		ArrayList<String> colours=new ArrayList<String>();
		colours.add("Red");
		colours.add("Yellow");
		System.out.println(colours);
		colours.add(0,"Blue");
		System.out.println(colours.get(1));
	} 
}