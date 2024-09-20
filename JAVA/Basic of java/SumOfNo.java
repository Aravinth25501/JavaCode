
import java.util.*;
public class SumOfNo {


    public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

     System.out.println("enter the numbers to sum :");
int sum =0;
     while(true){
   
        int num = sc.nextInt();

        if(num<=0){

            break;
        }
     sum+=num;
    } 
System.out.println(sum);

sc.close();
    }
    
}
