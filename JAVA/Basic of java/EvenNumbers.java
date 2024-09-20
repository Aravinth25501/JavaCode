import java.util.*;

public class EvenNumbers {
 public static void main(String[]  args){

  Scanner dc = new Scanner(System.in);

  System.out.println("enter the number : ");
     int i=dc.nextInt();
     
    if(i%2==0){
        
    System.out.println("even numbers:"+i);

    }

  dc.close();

 }   
}
