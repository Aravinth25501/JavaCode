
import java .util.*;

public class AreaOfTriangle {

    public static double get(int base,int height){

    

      double area=base*height/2;

      return area;

    }
    public static void main(String[] args){

        Scanner sc =new Scanner (System.in);

      System.out.println("Enter the base of the triangle: ");

          int base=sc.nextInt();
        
      System.out.println("Enter the height of the triangle: ");
       
          int height=sc.nextInt();

      double area= get(base,height);

    System.out.println(area);

sc.close();
    }
}
