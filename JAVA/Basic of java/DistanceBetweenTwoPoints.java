
import java.util.Scanner;
public class DistanceBetweenTwoPoints {

    public static double calculateDistance(double a,double b,double c,double d){

   

    Scanner sc =new Scanner(System.in);

    System.out.println("Enter the value of X1 : ");

    int x1=sc.nextInt();

    System.out.println("Enter the value of X2 : ");

    int x2=sc.nextInt();

    System.out.println("Enter the value of Y1 : ");

    int y1=sc.nextInt();
      
    System.out.println("Enter the value of Y2 : ");

    int y2=sc.nextInt();

    return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
   
}
 
     public static void main(String[] args){

       double re=calculateDistance(0, 0, 0, 0);
 
      System.out.println(re);

}
 
}
