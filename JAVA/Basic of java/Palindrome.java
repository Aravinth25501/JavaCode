import java.util.*;
public class Palindrome {

    public static void main(String[] args){

  Scanner sc=new Scanner(System.in);

     String rev=" ";
    System.out.println("enter the name :");

    String name=sc.nextLine();
     
    int length=name.length();

   

    for(int i=length-1;i>=0;i--){


      rev = rev+name.charAt(i);
    }
System.out.println(rev);
sc.close();
    }
    
}
