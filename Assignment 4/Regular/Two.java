public class Two {
    public static String removeAllNonAlphaNumeric(String s) {
        // use regular expression to replace all non-alphanumeric characters with empty string
        return s.replaceAll("[^A-Za-z0-9]", "");
    }

    public static void main(String[] args) {
        String s = "@!qwerty-qiejs'djdks,123";
        System.out.println(removeAllNonAlphaNumeric(s)); // output: GeeksforGeeks123
    }
}