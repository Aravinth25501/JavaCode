
import java.util.*;

public class Factorial {
  

    public static void main(String[] args) {

     Scanner sc = new Scanner (System.in);

     System.out.println("enter the number :");

     int number=sc.nextInt();

     int sum=1;

       for(int i=1;i<=number;i++){

         sum*=i;


       }
       System.out.println("factorial of "+ number + " is "+ sum);

       sc.close();
    }
}
