// Using Euclidean algorithm

import java.util.*;
public class functiontoPrintGCD {
    // Function to calculate the GCD of two numbers
    public static int calculateGCD(int a, int b) {
        // Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter The First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter The Second Number: ");
        int num2 = scanner.nextInt();


        int gcd = calculateGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }
}



/*

// Using Recursive Algorithm 
import java.util.*;
public class GCDFunction {
    // Recursive function to calculate the GCD of two numbers
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter The First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter The Second Number: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }
}
 

 */