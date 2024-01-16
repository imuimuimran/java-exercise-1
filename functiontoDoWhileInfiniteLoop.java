public class functiontoDoWhileInfiniteLoop {
    public static void printHelloWorld(int count) {
        int i = 1;
        do {
            System.out.println(i + " Hello World!");
            i++;
        } while (i <= count);
    }

    public static void main(String[] args) {
        // Using the function with a finite loop
        // printHelloWorld(10);

        // Using the function with an infinite loop
        printHelloWorld(Integer.MAX_VALUE); 
    }
}
