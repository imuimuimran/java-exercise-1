import java.util.*;

public class functiontoCircumferenceOfACircle {
    public static double printCircumference(double radius) {

        double circumference = 2 * 3.1415 * radius;

        return circumference;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Radious of the Circle: ");
        double radius = scanner.nextInt();

        double result = printCircumference(radius);

        System.out.println("Circumference of the circle with radius " + radius + " is: " + result);

        scanner.close();
    }
}
