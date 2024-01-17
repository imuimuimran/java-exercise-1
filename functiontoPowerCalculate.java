import java.util.*;

public class functiontoPowerCalculate {
    // Function to calculate x^n
    public static double calculatePower(double x, int n) {
        double result = 1.0;

        // Calculate x^n
        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the base (x): ");
        double x = scanner.nextDouble();

        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        // Call the function to calculate x^n
        double result = calculatePower(x, n);

        // Display the result
        System.out.println(x + " raised to the power of " + n + " is: " + result);

        scanner.close();
    }
}
