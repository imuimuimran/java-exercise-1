import java.util.*;

public class functiontoPrintAverage {
    public static double calculateAverage(int x, int y, int z) {

        double average = (x + y + z) / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int x = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int y = scanner.nextInt();
        System.out.print("Enter Third Number: ");
        int z = scanner.nextInt();

        double result = calculateAverage(x, y, z);

        System.out.printf("The average of %d, %d, and %d is %.2f%n", x, y, z, result);

        scanner.close();
    }
}
