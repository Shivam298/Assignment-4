class Four{
    public static void main(String[] args) {
      // create a StringBuilder to store the result
      String word;
      word="A good Place to Live.";
      StringBuilder sb = new StringBuilder();
      // loop through the word and append the lower-case letters to the result
      for (char c : word.toCharArray()) {
        if (Character.isLowerCase(c)) {
          sb.append(c);
        }
      }
      // loop through the word again and append the upper-case letters to the result
      for (char c : word.toCharArray()) {
        if (Character.isUpperCase(c)) {
          sb.append(c);
        }
      }
      // return the final string
      System.out.println( sb.toString());
    }
    }