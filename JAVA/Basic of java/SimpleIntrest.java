
import java.util.Scanner;
public class SimpleIntrest {
    
  public static void main(String [] aargs){

     Scanner sc=new  Scanner(System.in);

     System.out.println("Enter the principle: ");

     int p=sc.nextInt();

     System.out.println("Enter the time value:");

     int t=sc.nextInt();

     System.out.println("Enter the rate value: ");

     int r=sc.nextInt();

     int simpleintrest=p*t*r/100;

     System.out.println(simpleintrest);

     sc.close();

  }

}
