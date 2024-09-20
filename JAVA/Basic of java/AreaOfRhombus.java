import java.util.*;
class Area{

    int p;
    int q;

    Area(int p,int q){
 
         this.p=p;
         this.q=q;

    }


}

public class AreaOfRhombus {

    public static void main(String[] args){
 
   
 
             Scanner sc =new Scanner (System.in);

   System.out.println("Enter the value of p :");

   int p=sc.nextInt();

   System.out.println("enter the value of q :");

   int q=sc.nextInt();
    
              Area ar = new Area(p,q);

    System.out.println("Area of Rhombus is : "+ar.p*ar.q/2);

    sc.close();

    }


}
