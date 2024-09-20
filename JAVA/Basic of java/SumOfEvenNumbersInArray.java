import java.util.Scanner;

public class SumOfEvenNumbersInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) { // Check if the number is even
                sum += number;
            }
        }

        System.out.println("Sum of even numbers: " + sum);

        scanner.close();
    }
}
