import java.util.*;
public class Sum {

    public static void main(String[] args){

         Scanner sc =new Scanner (System.in);

         System.out.println("entr the Numbers to add : ");

         int num=sc.nextInt();

         int sum=0;
         while(num>0){

          sum=num+num;

    sum++;

         }
         
         
System.out.println(sum);
sc.close();
    }
    
}
