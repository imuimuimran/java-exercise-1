// Using Function: 
import java.util.*;

public class functiontoCountNumbers {

    // Function to count positive, negative, and zero numbers
    public static void countNumbers(int number, int[] counts) {
        if (number > 0) {
            counts[0]++; // Positive count
        } else if (number < 0) {
            counts[1]++; // Negative count
        } else {
            counts[2]++; // Zero count
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] counts = new int[3]; // 0: positive, 1: negative, 2: zero

        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            countNumbers(number, counts);

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Count of positive numbers: " + counts[0]);
        System.out.println("Count of negative numbers: " + counts[1]);
        System.out.println("Count of zero numbers: " + counts[2]);

        scanner.close();
    }
}


/*

// Without Using Function: 

import java.util.*;

public class functiontoCountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zero numbers: " + zeroCount);

        scanner.close();
    }
} 
 
*/

