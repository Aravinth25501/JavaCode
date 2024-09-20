
import java.util.*;
public class ReverseString {

    public static void main(String[] args){

    String reverse="";

     Scanner sc= new Scanner(System.in);

     System.out.println("enter the word to reverse the word : ");

     String word =sc.nextLine();

     int length=word.length();
      
     int halfLength=length/2;
      
     for(int i=length-1;i>=halfLength;i--){


        reverse= reverse +word.charAt(i);

        
     }
     System.out.println(reverse);
sc.close();
    }
    
}
