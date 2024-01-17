import java.util.*;

public class functiontoFibonacciSeries {
    // Function to generate and print Fibonacci series up to n terms
    public static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();

        // Call the function to print Fibonacci series
        printFibonacciSeries(n);

        scanner.close();
    }
}
