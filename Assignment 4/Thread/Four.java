import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Four {
    // The size of the matrices
    private static final int SIZE = 3;
    // The number of threads to use
    private static final int NUM_THREADS = 4;
    // The input matrices
    private static int[][] matrixA;
    private static int[][] matrixB;
    // The result matrix
    private static int[][] matrixC;
    // The class that generates random matrices
    private static class MatrixGenerator {
        // The random number generator
        private static Random random = new Random();
        // Generates a matrix of a given size with random values
        public static int[][] generate(int size) {
            int[][] matrix = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = random.nextInt(10);
                }
            }
            return matrix;
        }
    }
    // The class that performs the submatrix multiplication
    private static class MatrixMultiplier implements Runnable {
        // The start and end indices of the submatrix
        private int startRow;
        private int endRow;
        private int startCol;
        private int endCol;
        // The constructor that takes the indices of the submatrix
        public MatrixMultiplier(int startRow, int endRow, int startCol, int endCol) {
            this.startRow = startRow;
            this.endRow = endRow;
            this.startCol = startCol;
            this.endCol = endCol;
        }
        // The run method that performs the multiplication
        @Override
        public void run() {
            for (int i = startRow; i < endRow; i++) {
                for (int j = startCol; j < endCol; j++) {
                    matrixC[i][j] = 0;
                    for (int k = 0; k < SIZE; k++) {
                        matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
        }
    }
    // The main method that creates and executes the threads
    public static void main(String[] args) throws Exception {
        // Generate the input matrices
        matrixA = MatrixGenerator.generate(SIZE);
        matrixB = MatrixGenerator.generate(SIZE);
        // Initialize the result matrix
        matrixC = new int[SIZE][SIZE];
        // Get the current time in milliseconds
        long startTime = System.currentTimeMillis();
        // Create an executor service with a fixed thread pool
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        // Create an array of futures to store the results of the threads
        Future<?>[] futures = new Future[NUM_THREADS];
        // The size of the submatrix for each thread
        int segmentSize = SIZE / NUM_THREADS;
        // Submit the threads to the executor service and store the futures
        for (int i = 0; i < NUM_THREADS; i++) {
            int startRow = i * segmentSize;
            int endRow = (i == NUM_THREADS - 1) ? SIZE : (startRow + segmentSize);
            int startCol = 0;
            int endCol = SIZE;
            futures[i] = executor.submit(new MatrixMultiplier(startRow, endRow, startCol, endCol));
        }
        // Wait for all threads to finish
        for (Future<?> future : futures) {
            future.get();
        }
        // Shutdown the executor service
        executor.shutdown();
        // Get the current time in milliseconds
        long endTime = System.currentTimeMillis();
        // Print the input matrices
        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("Matrix B:");
        printMatrix(matrixB);

        // Print the result matrix
        System.out.println("Matrix C:");
        printMatrix(matrixC);

        // Print the time taken
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
    // A helper method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}