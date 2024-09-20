
import java.util.*;

public class Parallelogram {
    
public static  double getArea(int b,int h){

 double area=b*h;

 return area;

}

public static void main(String[] args){

 Scanner sc =new Scanner(System.in);

 System.out.println("Enter the breadth of Parellelogram : ");

 int breadth =sc.nextInt();

 System.out.println("Enter the height of Parallelogram :");

 int height =sc.nextInt();

 double area=getArea(breadth,height);

 System.out.println("Area of Parallelogram : "+area);



sc.close();


}

}
