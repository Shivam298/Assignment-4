import java.util.*;
public class One {
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int n;
    System.out.println("Enter number");
    n=in.nextInt();
    if(n%2!=0){
        throw new ArithmeticException("Odd number");
    }
  }
}