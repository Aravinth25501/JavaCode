
import java.util.*;
public class DiscountOfProduct {
    
    public static void main(String[] args){

        
     Scanner sc=new Scanner (System.in);


     System.out.println("Enter the discount percentage of the product % : ");

        double d=sc.nextInt();

      

     System.out.println("Enter the original price of the product :");

        int originalprice=sc.nextInt();

     double subtractValue=d/100;

     double multiply=subtractValue*originalprice;

     System.out.println(originalprice-multiply);

     sc.close();
    
    }
}
