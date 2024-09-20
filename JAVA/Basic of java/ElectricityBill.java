import java.util.*;

public class ElectricityBill {
    
  
  public static void main(String[] args ){
     Scanner sc =new Scanner(System.in);

      System.out.println("number : ");
      int unit=sc.nextInt();

      double sum=1;

      double sum1=1;

      double sum2=1;

      if(unit<=100){

       System.out.println("no cosst");

      }

      if(unit>100 && unit<=200){

       sum= unit*2.5;

           System.out.println(sum);
        
      }


      if(unit>200 && unit<=400){


        sum1=unit*4.5;

        System.out.println(sum1);

      }

      if(unit>400 && unit<=500){

        sum2=unit*6;

       System.out.println(sum2);


      }
sc.close();
}

  

     
}
