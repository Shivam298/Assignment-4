// Define a functional interface with a single abstract method
interface SumCalculator {
    int sum(int a, int b);
}

public class One {
    public static void main(String[] args) {
        // Create an instance of the interface using a lambda expression
        SumCalculator calculator = (a, b) -> a + b;
        // Invoke the sum method with two integer arguments
        int result = calculator.sum(10, 20);
        // Print the result
        System.out.println("The sum of 10 and 20 is " + result);
    }
}