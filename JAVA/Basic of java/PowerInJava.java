
import java.util.*;
public class PowerInJava {

    public static void main(String[] args){

    Scanner sc =new Scanner(System.in);

    System.out.println("enter the number :");

    int num=sc.nextInt();

    System.out.println("enter the power to power the given number : ");

    int power=sc.nextInt();

    double result=Math.pow(num, power);

    System.out.println(result);
sc.close();
    }
    
}
