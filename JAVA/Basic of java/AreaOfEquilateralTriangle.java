import java.util.*;
public class AreaOfEquilateralTriangle {
    

    public static double getArea(double a){

              
        double B=1.73205080757*a*a/4;

        return B;


    }

    public static void main(String[] args){

     Scanner sc=new Scanner (System.in);

    System.out.println("Enter the area of Triangle :");

    int A= sc.nextInt();

    double result=getArea(A);

   System.out.println(result);

sc.close();
    }
}
