import java.io.*;
import java.util.regex.*;
// Main class
class Three {
	public static boolean isValid(String s)
	{
		Pattern p = Pattern.compile("^\\d{10}$");
		Matcher m = p.matcher(s);
		// Returning boolean value
		return (m.matches());
	}
	public static void main(String[] args)
	{
		// Considering two numbers as inputs
		// Custom input numbers
		String s = "7984286257";
		String s_1 = "5426391";
		// Checking over method 1 for string 1
		if (isValid(s))
			// Print statement
			System.out.println("Valid Number");
		else
			// Print statement
			System.out.println("Invalid Number");
		// Again, checking over method 1 for string 1
		if (isValid(s_1))
			// Print statement
			System.out.println("Valid Number");
		else
			// Print statement
			System.out.println("Invalid Number");
	}
}