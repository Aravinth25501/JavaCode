import java.util.Scanner;

public class FibanoicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series up to " + n + " terms:");

        // First two terms of Fibonacci series
        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + " " + num2 + " ");

        // Generate and print the remaining terms
        for (int i = 3; i <= n; i++) {
            int nextNum = num1 + num2;
            System.out.print(nextNum + " ");

            // Update num1 and num2 for the next iteration
            num1 = num2;
            num2 = nextNum;
        }

        scanner.close();
    }
}

