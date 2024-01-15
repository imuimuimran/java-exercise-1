import java.util.*;

public class functiontoSumofAllOdd {
    public static void printSumOfOddNumbers(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                sum += i;
            }  
        }

        System.out.println("Sum of odd numbers from 1 to " + n + ": " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();

        printSumOfOddNumbers(n);

        scanner.close();
    }
}
