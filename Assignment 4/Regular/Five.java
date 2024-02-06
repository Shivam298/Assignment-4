class Five{
    public static void main(String[] args) {
      // convert the string to uppercase
      String str;
      str="We live only once";
      str = str.toUpperCase();
      // remove all the non-vowel characters and store them in a string
      String vowels = str.replaceAll("[^AEIOU]", "");
      // remove all the non-consonant characters and store them in a string
      String consonants = str.replaceAll("[AEIOU]", "");
      // print the results
      System.out.println("Vowels: " + vowels);
      System.out.println("Consonants: " + consonants);
    }
    }