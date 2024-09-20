import java.util.Scanner;

public class constructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Circle radius: ");
        double radius = scanner.nextDouble();

        // Calculations
        double diameter = 2 * radius;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        // Output
        System.out.printf("Diameter: %.6f Area: %.6f%n", diameter, area);
        System.out.printf("Circumference: %.6f%n", circumference);

        scanner.close();
    }
}
