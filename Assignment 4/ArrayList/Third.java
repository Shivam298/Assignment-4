import java.io.*;
import java.util.*;

class Third
{ 
public static void main(String args[]) 
	{ 
		ArrayList<String> colours=new ArrayList<String>();
		colours.add("Red");
		colours.add("Yellow");
		System.out.println(colours);
		colours.add(0,"Blue");
		for(String str:colours)
		System.out.println(str);
	} 
}