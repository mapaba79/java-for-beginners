import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;

        // Ask for user input
        System.out.print("Enter a positive integer: ");
        n = scanner.nextInt();

        // Calculate sum of even numbers
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        // Print the sum
        System.out.println("Sum of even numbers from 2 to " + n + " is " + sum);
        scanner.close();
    }
}