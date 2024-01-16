import java.util.*;
public class functiontoCheckAdultness {
    public static String checkAdultness(int age) {
        if (age >= 18) {
            return "You are an adult";
        } else {
            return "You are not an adult";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();

        String result = checkAdultness(age);

        System.out.println(result);

        scanner.close();
    }
}
