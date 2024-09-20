import java.util.Scanner;

class Calculator {
    double a;
    double b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

     double calculate(char operator){
        double result;

        switch (operator){
            case '+':
                result = a + b;
                break;
            case '%':
                result = a % b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            default:
                System.out.println("Invalid operator");
                return 0; 
        }

        return result;
    }
}
public class Calculato{
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the first number: ");
        double a= scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, %): ");
        char operator = scanner.next().charAt(0);
         
        Calculator cal =  new  Calculator(a,b);
        
        double result = cal.calculate(operator);
       
        System.out.println("Result: " + result);

        scanner.close();
    }

}