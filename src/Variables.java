import java.util.Scanner;

class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.printf("The sum of %d + %d = %d\n", a, b, sum);

        scanner.close();
    }
}
