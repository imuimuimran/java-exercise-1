import java.util.*;
public class functiontoGreaterNumber {
    public static int findGreaterNumber(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int number2 = scanner.nextInt();

        int result = findGreaterNumber(number1, number2);

        System.out.println("The greater number between " + number1 + " and " + number2 + " is: " + result);

        scanner.close();
    }
}
