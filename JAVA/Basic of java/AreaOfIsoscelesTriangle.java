import java.util.*;

public class AreaOfIsoscelesTriangle {
    
    public static double getArea(int b,int h){

                double area=b*h/2;

    return area;



    }

public static void main(String[] args){
 
Scanner sc=new Scanner(System.in);

System.out.println("Enter the breadth of the isosceles Triangle :");

int breadth= sc.nextInt();

System.out.println("Enter the height of the isosceles Triangle :");

int height=sc.nextInt();

double area=getArea(breadth,height);

System.out.println("Area of Isosceles Triangle is : "+area);

sc.close();

}

}
