import java.text.NumberFormat;
import java.util.Locale;
public class One {
    public static void main(String[] args) {
        // Create a number
        long number = 1234567890L;
        // Print the original number
        System.out.println("Original number: " + number);
        // Create a NumberFormat object for the default locale
        NumberFormat defaultFormat = NumberFormat.getInstance();
        // Format the number with the default locale's thousand separator
        String defaultFormatted = defaultFormat.format(number);
        // Print the formatted number
        System.out.println("Formatted with default locale: " + defaultFormatted);
    }
}